package problem.stack;

import java.util.Stack;

public class RemoveStars {
    public String removeStars(String s) {
        Stack<Character>stack = new Stack<>();

        for (char ch : s.toCharArray()){
            if (ch == '*' ){
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder(stack.size());

        for (char c : stack){
            sb.append(c);
        }
        return sb.toString();
    }
}
