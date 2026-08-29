//Largest Rectangle in Histogram
//Using Stack & Index value
//Max = 5 * 2 = 10
//Time = O(n) Space = O(n)


import java.util.Stack;

public class leetcode_84 {
    public int largestRectangleArea(int[] heights){
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;

        for(int i = 0; i<=n; i++){
//            if the i given element is n so it has cross every other element
            int currentHeight = (i==n)? 0 : heights[i];

//            if the current height is less than current stack value
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]){
//                then pop the element
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() -1;
//                compare and calculation maxArea
                maxArea = Math.max(maxArea, height*width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
