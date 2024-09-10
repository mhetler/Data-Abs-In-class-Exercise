import java.util.Stack;

public class Solution{
    public boolean isValid(String s) {
        if(s.length() <= 1) {
            return false;
        }
        Stack <Character> stank = new Stack<>();

        for(int i =0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stank.push(s.charAt(i));
            }
            else{
                if(s.charAt(i) == ')') {
                    if(stank.pop() != '(') {
                        return false;
                    }
                }
                if(s.charAt(i) == '}') {
                    if(stank.pop() != '{') {
                        return false;
                    }
                }
                if(s.charAt(i) == ']') {
                    if(stank.pop() != '[') {
                        return false;
                    }
                }

            }
        }
        if(stank.isEmpty()){
            return true;
        }
            return false;
    }
}