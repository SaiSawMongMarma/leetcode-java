//Car Fleet
//2D Array
//Solving by measuring time.
//Time: O(n) Sorting: O(nlogn) Space: O(n^2)


import java.util.Arrays;

public class leetcode_853 {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
//        Car & subsiquent time to reach to the end
        double[][] cars = new double[n][2];

//       Calculation
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

//        Sort The given cars based on the given positions
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

//        count is the fleet numbers
        int count = 0;
        double prevTime = 0;
        for (double[] car : cars) {
            if (car[1] > prevTime) {
                count++;
                prevTime = car[1];
            }
        }

        return count;
    }
}
