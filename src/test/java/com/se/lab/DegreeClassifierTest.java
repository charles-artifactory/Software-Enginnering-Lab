package com.se.lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DegreeClassifierTest {

    private DegreeClassifier classifier;

    @BeforeEach
    public void setUp() {
        classifier = new DegreeClassifier();
    }

    // First-Class Tests
    @Test
    public void testFirstClass_LowerBoundary() {
        assertEquals("First-Class Honours", classifier.classify(70.0));
    }

    @Test
    public void testFirstClass_MiddleValue() {
        assertEquals("First-Class Honours", classifier.classify(85.0));
    }

    @Test
    public void testFirstClass_UpperBoundary() {
        assertEquals("First-Class Honours", classifier.classify(100.0));
    }

    // Upper Second-Class(2:1) Tests
    @Test
    public void testUpperSecondClass_LowerBoundary() {
        assertEquals("Upper Second-Class Honours (2:1)", classifier.classify(60.0));
    }

    @Test
    public void testUpperSecondClass_MiddleValue() {
        assertEquals("Upper Second-Class Honours (2:1)", classifier.classify(65.0));
    }

    @Test
    public void testUpperSecondClass_UpperBoundary() {
        assertEquals("Upper Second-Class Honours (2:1)", classifier.classify(69.99));
    }

    // Lower Second-Class(2:2) Tests
    @Test
    public void testLowerSecondClass_LowerBoundary() {
        assertEquals("Lower Second-Class Honours (2:2)", classifier.classify(50.0));
    }

    @Test
    public void testLowerSecondClass_MiddleValue() {
        assertEquals("Lower Second-Class Honours (2:2)", classifier.classify(55.0));
    }

    @Test
    public void testLowerSecondClass_UpperBoundary() {
        assertEquals("Lower Second-Class Honours (2:2)", classifier.classify(59.99));
    }

    // Third-Class Tests
    @Test
    public void testThirdClass_LowerBoundary() {
        assertEquals("Third-Class Honours", classifier.classify(40.0));
    }

    @Test
    public void testThirdClass_MiddleValue() {
        assertEquals("Third-Class Honours", classifier.classify(45.0));
    }

    @Test
    public void testThirdClass_UpperBoundary() {
        assertEquals("Third-Class Honours", classifier.classify(49.99));
    }

    // Fail Tests
    @Test
    public void testFail_LowerBoundary() {
        assertEquals("Fail (No Honours)", classifier.classify(0.0));
    }

    @Test
    public void testFail_MiddleValue() {
        assertEquals("Fail (No Honours)", classifier.classify(20.0));
    }

    @Test
    public void testFail_UpperBoundary() {
        assertEquals("Fail (No Honours)", classifier.classify(39.99));
    }

    // Invalid Input Tests
    @Test
    public void testInvalidInput_BelowMinimum() {
        assertThrows(IllegalArgumentException.class, () -> classifier.classify(-1.0));
    }

    @Test
    public void testInvalidInput_AboveMaximum() {
        assertThrows(IllegalArgumentException.class, () -> classifier.classify(100.01));
    }
}