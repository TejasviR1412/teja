package CodeWars;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    public static void main(String[] args) {
        String s1 = "din";
        String s2 = "recede";
        String s3 = "Success";
        String s4 = "(( @";
        String s5 = "Prespecialized";
        String s6 = "   ()(   ";

        System.out.println(encode(s1));
        System.out.println(encode(s2));
        System.out.println(encode(s3));
        System.out.println(encode(s4));
        System.out.println(encode(s5));
        System.out.println(encode(s5).equals(")()())()(()()("));
        System.out.println(encode(s6));
        System.out.println(encode(s6).equals("))))())))"));
    }

    static String encode(String word){
        Map<Character , Integer> hashMap = new HashMap<>();
        word = word.toLowerCase();
        StringBuilder output = new StringBuilder();

        for(char ch : word.toCharArray()){
            hashMap.put(ch , hashMap.getOrDefault(ch,0)+1);
        }

        for(char ch : word.toCharArray()){
           output.append(hashMap.get(ch) > 1 ? ")" : "(");
        }

       // System.out.println(hashMap);
        return output.toString();
    }
}
