class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        int len=s.length();
        StringBuilder str1=new StringBuilder();
        int open=0;
        for(int i=0;i<len;i++){
            if(stk.empty() && s.charAt(i)=='('){
                stk.push('(');
            }
            else if(s.charAt(i)=='('){
                str1.append('(');
                open++;
            }
            else if(open!=0 && s.charAt(i)==')'){
                str1.append(')');
                open--;
            }
            else if(open==0 && s.charAt(i)==')'){
                stk.pop();
            }
        }
    return str1.toString();
    }
}