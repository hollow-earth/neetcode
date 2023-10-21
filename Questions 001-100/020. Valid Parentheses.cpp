class Solution {
public:
    bool isValid(string s) {
        stack<char> stacked;
        for (char c: s){
            if (c == '(' || c == '{' || c == '[') stacked.push(c);
            else if (stacked.size() > 0){
                if (c == ')' && stacked.top() == '(') stacked.pop();
                else if (c == '}' && stacked.top() == '{') stacked.pop();
                else if (c == ']' && stacked.top() == '[') stacked.pop();
                else return false;
            }
            else return false;
        }
        return (stacked.size() == 0);
    }
};