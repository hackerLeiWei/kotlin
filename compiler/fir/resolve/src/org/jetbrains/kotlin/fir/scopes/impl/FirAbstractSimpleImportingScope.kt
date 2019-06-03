/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.scopes.impl

import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.declarations.impl.FirResolvedImportImpl
import org.jetbrains.kotlin.fir.resolve.FirSymbolProvider
import org.jetbrains.kotlin.fir.resolve.calls.TowerScopeLevel
import org.jetbrains.kotlin.fir.scopes.FirPosition
import org.jetbrains.kotlin.fir.scopes.ProcessorAction
import org.jetbrains.kotlin.fir.symbols.*
import org.jetbrains.kotlin.fir.names.FirClassId
import org.jetbrains.kotlin.fir.names.FirName

abstract class FirAbstractSimpleImportingScope(session: FirSession) : FirAbstractImportingScope(session, lookupInFir = true) {

    protected abstract val simpleImports: Map<FirName, List<FirResolvedImportImpl>>

    override fun processClassifiersByName(
        name: FirName,
        position: FirPosition,
        processor: (ConeClassifierSymbol) -> Boolean
    ): Boolean {
        val imports = simpleImports[name] ?: return true
        if (imports.isEmpty()) return true
        val provider = FirSymbolProvider.getInstance(session)
        for (import in imports) {
            val importedName = import.importedName ?: continue
            val classId =
                import.resolvedClassId?.createNestedClassId(importedName)
                    ?: FirClassId(import.packageFqName, importedName)
            val symbol = provider.getClassLikeSymbolByFqName(classId) ?: continue
            if (!processor(symbol)) {
                return false
            }
        }
        return true
    }

    override fun <T : ConeCallableSymbol> processCallables(
        name: FirName,
        token: TowerScopeLevel.Token<T>,
        processor: (ConeCallableSymbol) -> ProcessorAction
    ): ProcessorAction {


        val imports = simpleImports[name] ?: return ProcessorAction.NEXT
        if (imports.isEmpty()) return ProcessorAction.NEXT

        for (import in imports) {
            if (processCallables(import, import.importedName!!, token, processor).stop()) {
                return ProcessorAction.STOP
            }
        }
        return ProcessorAction.NEXT
    }
}
