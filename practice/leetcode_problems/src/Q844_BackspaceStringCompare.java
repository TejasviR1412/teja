import java.util.Stack;

public class Q844_BackspaceStringCompare {
    public static void main(String[] args) {
        String s1 = "ab#c";
        String t1 = "ad#c";

        String s2 = "ab##";
        String t2 = "c#d#";

        String s3 = "a#c";
        String t3 = "b";

        System.out.println(backspaceCompare(s1,t1));
        System.out.println(backspaceCompare(s2,t2));
        System.out.println(backspaceCompare(s3,t3));
        System.out.println("***********************");
        System.out.println(backspaceCompare_1(s1,t1));
        System.out.println(backspaceCompare_1(s2,t2));
        System.out.println(backspaceCompare_1(s3,t3));
    }

    public static boolean backspaceCompare_1(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        StringBuilder stringS = new StringBuilder();

        Stack<Character> stackT = new Stack<>();
        StringBuilder stringT = new StringBuilder();

        for(char c: s.toCharArray()){
            if(c != '#'){
                stackS.push(c);
                stringS.append(c);
            }else {
                if(!stackS.isEmpty()){
                    stackS.pop();
                    stringS.deleteCharAt(stringS.length()-1);
                }
            }
        }

        for(char c: t.toCharArray()){
            if(c != '#'){
                stackT.push(c);
                stringT.append(c);
            }else {
                if(!stackT.isEmpty()){
                    stackT.pop();
                    stringT.deleteCharAt(stringT.length()-1);
                }
            }
        }

        return stringS.toString().contentEquals(stringT);
    }

    public static boolean backspaceCompare(String s, String t) {
        String s1 = removeHashTag(s);
        String s2 = removeHashTag(t);

        return s1.equals(s2);
    }

    private static String removeHashTag(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '#'){
                if(!sb.isEmpty()){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
}