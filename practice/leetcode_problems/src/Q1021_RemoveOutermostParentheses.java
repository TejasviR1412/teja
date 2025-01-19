public class Q1021_RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s1 = "(()())(())";
        String s2 = "(()())(())(()(()))";
        String s3 = "()()";

        System.out.println(removeOuterParentheses(s1));
        System.out.println(removeOuterParentheses(s2));
        System.out.println(removeOuterParentheses(s3));
    }

    public static String removeOuterParentheses(String s) {
        int openCount = 0;
        int closeCount = 0;
        int start = 0;

        StringBuilder sb = new StringBuilder();

        for(int i=0; i< s.length(); i++){
            if(s.charAt(i) == '('){
                openCount++;
            }else if(s.charAt(i) == ')'){
                closeCount++;
            }

            if(openCount == closeCount){
                sb.append(s, start+1, i);
                start = i+1;
            }
        }

        return sb.toString();
    }
}