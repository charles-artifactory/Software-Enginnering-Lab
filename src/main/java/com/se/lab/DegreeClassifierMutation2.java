package com.se.lab;

/**
 * Class to classify UK undergraduate honours degrees based on weighted average marks.
 * MUTATION 2: Changed logical OR to logical AND in the validation
 */
public class DegreeClassifierMutation2 {

    /**
     * Classifies the degree based on the weighted average mark.
     *
     * @param averageMark the weighted average mark (0-100)
     * @return the degree classification as a string
     * @throws IllegalArgumentException if the mark is outside the valid range
     */
    public String classify(double averageMark) {
        // Validate input
        // MUTATION: Changed || to &&
        if (averageMark < 0 && averageMark > 100) {
            throw new IllegalArgumentException("Average mark must be between 0 and 100");
        }

        // Determine classification
        if (averageMark >= 70) {
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