import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char op_bracket;
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            }
            else {
                if (st.isEmpty()) {return false;}
                else {
                    op_bracket = st.pop();
                    if (!(op_bracket == '(' && c == ')') &&
                        !(op_bracket == '[' && c == ']') &&
                        !(op_bracket == '{' && c == '}')) {
                            return false;
                        }   
                    }
            }
        }
        return st.isEmpty();
    }
}