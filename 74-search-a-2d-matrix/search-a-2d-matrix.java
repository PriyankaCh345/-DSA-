public class Solution {
    // Function to search for a target value in the matrix
    public boolean searchMatrix(int[][] matrix, int target) {
        // Get number of rows in the matrix
        int n = matrix.length;

        // Get number of columns in the matrix
        int m = matrix[0].length;

        // Traverse each row
        for (int i = 0; i < n; i++) {
            // Traverse each column in the current row
            for (int j = 0; j < m; j++) {
                // Check if the current element matches the target
                if (matrix[i][j] == target)
                    return true;
            }
        }

        // Return false if the target is not found
        return false;
    }
}