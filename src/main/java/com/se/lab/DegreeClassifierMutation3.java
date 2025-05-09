package com.se.lab;

/**
 * Class to classify UK undergraduate honours degrees based on weighted average marks.
 * MUTATION 3: Swapped return values for 2:2 and Third-Class
 */
public class DegreeClassifierMutation3 {

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
        if (averageMark >= 70) {
            return "First-Class Honours";
        } else if (averageMark >= 60) {
            return "Upper Second-Class Honours (2:1)";
        } else if (averageMark >= 50) {
            // MUTATION: Returned Third-Class instead of 2:2
            return "Third-Class Honours";
        } else if (averageMark >= 40) {
            // MUTATION: Returned 2:2 instead of Third-Class
            return "Lower Second-Class Honours (2:2)";
        } else {
            return "Fail (No Honours)";
        }
    }
}