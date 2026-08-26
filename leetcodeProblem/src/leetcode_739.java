//Daily Temperatures (Mid)

//Has to be iterated over entire array
//Stack(LIFO) by using index value storing index position
//Comparing index value and storing compared greater index position O(n)


import java.util.Stack;

public class leetcode_739 {
    public int[] dailyTemperature(int[] temperatures){
//        mark out the length of the initial array
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

//        iterating one by one
        for(int i = 0; i<n; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }
        return answer;
    }

}
