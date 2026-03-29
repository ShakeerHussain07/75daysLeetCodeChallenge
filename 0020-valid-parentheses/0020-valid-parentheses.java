class Solution {
    public boolean isValid(String s) {
         if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(x == '(' || x == '{' || x == '['){
                stack.push(x);
            }
            else if(stack.empty()){
                return false;
            }
            else if(stack.peek() == '(' && x == ')' || stack.peek() == '{' && x == '}' ||stack.peek() == '[' && x == ']'){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.empty();
    }
}