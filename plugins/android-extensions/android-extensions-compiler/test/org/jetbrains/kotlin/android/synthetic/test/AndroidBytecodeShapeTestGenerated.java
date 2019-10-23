/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.android.synthetic.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class AndroidBytecodeShapeTestGenerated extends AbstractAndroidBytecodeShapeTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("activityWithEntityOptionsNoCache")
    public void testActivityWithEntityOptionsNoCache() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/activityWithEntityOptionsNoCache/");
    }

    public void testAllFilesPresentInBytecodeShape() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape"), Pattern.compile("^([^\\.]+)$"), false);
    }

    @TestMetadata("baseClass")
    public void testBaseClass() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/baseClass/");
    }

    @TestMetadata("baseClassFragment")
    public void testBaseClassFragment() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/baseClassFragment/");
    }

    @TestMetadata("clearCache")
    public void testClearCache() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/clearCache/");
    }

    @TestMetadata("clearCacheBaseClass")
    public void testClearCacheBaseClass() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/clearCacheBaseClass/");
    }

    @TestMetadata("dialog")
    public void testDialog() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/dialog/");
    }

    @TestMetadata("extensionFunctions")
    public void testExtensionFunctions() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/extensionFunctions/");
    }

    @TestMetadata("extensionFunctionsFragment")
    public void testExtensionFunctionsFragment() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/extensionFunctionsFragment/");
    }

    @TestMetadata("extensionFunctionsView")
    public void testExtensionFunctionsView() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/extensionFunctionsView/");
    }

    @TestMetadata("fqNameInAttr")
    public void testFqNameInAttr() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/fqNameInAttr/");
    }

    @TestMetadata("fqNameInAttrFragment")
    public void testFqNameInAttrFragment() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/fqNameInAttrFragment/");
    }

    @TestMetadata("fqNameInTag")
    public void testFqNameInTag() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/fqNameInTag/");
    }

    @TestMetadata("fqNameInTagFragment")
    public void testFqNameInTagFragment() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/fqNameInTagFragment/");
    }

    @TestMetadata("fragmentWithEntityOptionsNoCache")
    public void testFragmentWithEntityOptionsNoCache() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/fragmentWithEntityOptionsNoCache/");
    }

    @TestMetadata("kt18545")
    public void testKt18545() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/kt18545/");
    }

    @TestMetadata("multiFile")
    public void testMultiFile() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/multiFile/");
    }

    @TestMetadata("multiFileFragment")
    public void testMultiFileFragment() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/multiFileFragment/");
    }

    @TestMetadata("onDestroyFragment")
    public void testOnDestroyFragment() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/onDestroyFragment/");
    }

    @TestMetadata("simple")
    public void testSimple() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/simple/");
    }

    @TestMetadata("simpleFragment")
    public void testSimpleFragment() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/simpleFragment/");
    }

    @TestMetadata("simpleFragmentProperty")
    public void testSimpleFragmentProperty() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/simpleFragmentProperty/");
    }

    @TestMetadata("simpleHashMapCacheImplementation")
    public void testSimpleHashMapCacheImplementation() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/simpleHashMapCacheImplementation/");
    }

    @TestMetadata("simpleView")
    public void testSimpleView() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/simpleView/");
    }

    @TestMetadata("supportExtensionFunctionsFragment")
    public void testSupportExtensionFunctionsFragment() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/supportExtensionFunctionsFragment/");
    }

    @TestMetadata("supportExtensionFunctionsFragmentAndroidx")
    public void testSupportExtensionFunctionsFragmentAndroidx() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/supportExtensionFunctionsFragmentAndroidx/");
    }

    @TestMetadata("supportSimpleFragment")
    public void testSupportSimpleFragment() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/supportSimpleFragment/");
    }

    @TestMetadata("supportSimpleFragmentAndroidx")
    public void testSupportSimpleFragmentAndroidx() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/supportSimpleFragmentAndroidx/");
    }

    @TestMetadata("supportSimpleFragmentProperty")
    public void testSupportSimpleFragmentProperty() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/supportSimpleFragmentProperty/");
    }

    @TestMetadata("supportSimpleFragmentPropertyAndroidx")
    public void testSupportSimpleFragmentPropertyAndroidx() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/supportSimpleFragmentPropertyAndroidx/");
    }

    @TestMetadata("viewStub")
    public void testViewStub() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/viewStub/");
    }

    @TestMetadata("viewWithCache")
    public void testViewWithCache() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/viewWithCache/");
    }

    @TestMetadata("viewWithDefaultNoCache")
    public void testViewWithDefaultNoCache() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/viewWithDefaultNoCache/");
    }

    @TestMetadata("viewWithEntityOptionsNoCache")
    public void testViewWithEntityOptionsNoCache() throws Exception {
        runTest("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/viewWithEntityOptionsNoCache/");
    }
}
