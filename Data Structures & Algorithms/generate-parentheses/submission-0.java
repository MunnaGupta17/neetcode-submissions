class Solution {
    
    Set<String> result;

    boolean validParentheses(StringBuilder sb){
        System.out.println(sb.toString());
        boolean isValid = true;
        StringBuilder newSb = new StringBuilder(sb);
        Stack<Character> stack = new Stack<>();
        int pointer = 0;
        while(pointer < newSb.length()){
            if(newSb.charAt(pointer) == '('){
                stack.push(newSb.charAt(pointer));
            }else if(newSb.charAt(pointer) == ')'){
                if(stack.isEmpty()){
                    isValid = false;
                    break;
                }
                stack.pop();
            }
            pointer++;
        }
        if(isValid && stack.isEmpty()){
            result.add(newSb.toString());
        }
        return isValid;
    }
    void bfs(int n,StringBuilder temp){
        if(n == 0){
           validParentheses(temp);
           return;
        }
        temp.append("(");
        bfs(n-1, temp);
        temp.deleteCharAt(temp.length()-1);
        temp.append(")");
        bfs(n-1,temp);
                temp.deleteCharAt(temp.length()-1);


    }

    public List<String> generateParenthesis(int n) {
        result = new HashSet<>();
        // List<String> list = new ArrayList<>();
        bfs(n*2,new StringBuilder());
         System.out.println(result);
        return new ArrayList<>(result);

    }
}
