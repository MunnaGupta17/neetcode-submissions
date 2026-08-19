class Solution {
    public boolean isValid(String s) {
        Stack<Character> openParen = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                openParen.push(s.charAt(i));
            }else{
                if(openParen.isEmpty()) return false;
                char lastopen = openParen.peek();
                if(lastopen == '(' && s.charAt(i) == ')'){
                   openParen.pop();
                }else if(lastopen == '{' && s.charAt(i) == '}'){
                   openParen.pop();
                }else if(lastopen == '[' && s.charAt(i) == ']'){
                   openParen.pop();
                }else{
                    return false;
                }
            }
        }
        if(openParen.size() == 0) return true;
        return false;
    }
}

