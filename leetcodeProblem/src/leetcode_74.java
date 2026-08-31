//Search a 2D Matrix
//m=3 (row)
//n=4 (column)
//1D Array as 2D Matrix solving by using Binary Search

public class leetcode_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
//        last position
        int right = m * n - 1;

//      Using Binary Search
        while (left <= right) {
            int mid = left + (right - left) / 2;
//            finding value in 2D Array
            int midValue = matrix[mid / n][mid % n];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
