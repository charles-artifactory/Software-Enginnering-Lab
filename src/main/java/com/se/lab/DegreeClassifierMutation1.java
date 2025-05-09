package com.se.lab;

/**
 * Class to classify UK undergraduate honours degrees based on weighted average marks.
 * MUTATION 1: Changed First-Class boundary from 70 to 75
 */
public class DegreeClassifierMutation1 {

    /**
     * Classifies the degree based on the weighted average mark.
     *
     * @param averageMark the weighted average mark (0-100)
     * @return the degree classification as a string
     * @throws IllegalArgumentException if the mark is outside the valid range
     */
    public String classify(double averageMark) {
        // Validate input
        if (averageMark < 0 || averageMark > 100) {
            throw new IllegalArgumentException("Average mark must be between 0 and 100");
        }

        // Determine classification
        // MUTATION: Changed >= 70 to >= 75
        if (averageMark >= 75) {
            return "First-Class Honours";
        } else if (averageMark >= 60) {
            return "Upper Second-Class Honours (2:1)";
        } else if (averageMark >= 50) {
            return "Lower Second-Class Honours (2:2)";
        } else if (averageMark >= 40) {
            return "Third-Class Honours";
        } else {
            return "Fail (No Honours)";
        }
    }
}