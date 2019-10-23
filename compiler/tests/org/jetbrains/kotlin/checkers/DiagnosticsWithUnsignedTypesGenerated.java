/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.checkers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/testsWithUnsignedTypes")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DiagnosticsWithUnsignedTypesGenerated extends AbstractDiagnosticsWithUnsignedTypes {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInTestsWithUnsignedTypes() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithUnsignedTypes"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("allowedVarargsOfUnsignedTypes.kt")
    public void testAllowedVarargsOfUnsignedTypes() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/allowedVarargsOfUnsignedTypes.kt");
    }

    @TestMetadata("callDefaultConstructorOfUnsignedType.kt")
    public void testCallDefaultConstructorOfUnsignedType() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/callDefaultConstructorOfUnsignedType.kt");
    }

    @TestMetadata("explicitUnsignedLongTypeCheck.kt")
    public void testExplicitUnsignedLongTypeCheck() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/explicitUnsignedLongTypeCheck.kt");
    }

    @TestMetadata("forbiddenEqualsOnUnsignedTypes.kt")
    public void testForbiddenEqualsOnUnsignedTypes() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/forbiddenEqualsOnUnsignedTypes.kt");
    }

    @TestMetadata("lateinitUnsignedType.kt")
    public void testLateinitUnsignedType() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/lateinitUnsignedType.kt");
    }

    @TestMetadata("overloadResolutionOfBasicOperations.kt")
    public void testOverloadResolutionOfBasicOperations() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/overloadResolutionOfBasicOperations.kt");
    }

    @TestMetadata("unsignedLiteralsInsideConstVals.kt")
    public void testUnsignedLiteralsInsideConstVals() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/unsignedLiteralsInsideConstVals.kt");
    }

    @TestMetadata("unsignedLiteralsOn1_2.kt")
    public void testUnsignedLiteralsOn1_2() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/unsignedLiteralsOn1_2.kt");
    }

    @TestMetadata("unsignedLiteralsOverflowSignedBorder.kt")
    public void testUnsignedLiteralsOverflowSignedBorder() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/unsignedLiteralsOverflowSignedBorder.kt");
    }

    @TestMetadata("unsignedLiteralsTypeCheck.kt")
    public void testUnsignedLiteralsTypeCheck() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/unsignedLiteralsTypeCheck.kt");
    }

    @TestMetadata("varargTypeToArrayTypeCheck.kt")
    public void testVarargTypeToArrayTypeCheck() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/varargTypeToArrayTypeCheck.kt");
    }

    @TestMetadata("wrongLongSuffixForULong.kt")
    public void testWrongLongSuffixForULong() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/wrongLongSuffixForULong.kt");
    }

    @TestMetadata("compiler/testData/diagnostics/testsWithUnsignedTypes/conversions")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Conversions extends AbstractDiagnosticsWithUnsignedTypes {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInConversions() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithUnsignedTypes/conversions"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("conversionOfSignedToUnsigned.kt")
        public void testConversionOfSignedToUnsigned() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/conversions/conversionOfSignedToUnsigned.kt");
        }

        @TestMetadata("inferenceForSignedAndUnsignedTypes.kt")
        public void testInferenceForSignedAndUnsignedTypes() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/conversions/inferenceForSignedAndUnsignedTypes.kt");
        }

        @TestMetadata("overloadResolutionForSignedAndUnsignedTypes.kt")
        public void testOverloadResolutionForSignedAndUnsignedTypes() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/conversions/overloadResolutionForSignedAndUnsignedTypes.kt");
        }

        @TestMetadata("signedToUnsignedConversionWithExpectedType.kt")
        public void testSignedToUnsignedConversionWithExpectedType() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithUnsignedTypes/conversions/signedToUnsignedConversionWithExpectedType.kt");
        }
    }
}
