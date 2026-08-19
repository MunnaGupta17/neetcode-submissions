class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] result = new int[n];

        for(int i = 0; i<n; i++){
            if(stack.isEmpty()){
                stack.push(i);
            }else{

                while(stack.isEmpty() == false && temperatures[stack.peek()] < temperatures[i]){
                      result[stack.peek()] = i-stack.peek();
                      stack.pop();
                }
                stack.push(i);
            }
        }
        // System.out.println(stack);
        return result;
    }
}


// [30,38,30,36,35,40,28]
//           |
// counter = 1
// [38]