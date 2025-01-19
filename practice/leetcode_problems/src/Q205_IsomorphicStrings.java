import java.util.HashMap;
import java.util.Map;

public class Q205_IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";

        String s2 = "foo";
        String t2 = "bar";


    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> hashMap = new HashMap<>();
        Map<Character,Character> reverseMap = new HashMap<>();

        hashMap.put(s.charAt(0) , t.charAt(0));
        reverseMap.put(t.charAt(0) , s.charAt(0));

        for(int i = 1 ; i< s.length() ; i++){

            if((hashMap.containsKey(s.charAt(i)) && !(hashMap.get(s.charAt(i)) == t.charAt(i))) ||
                    (reverseMap.containsKey(t.charAt(i)) && !(reverseMap.get(t.charAt(i)) == s.charAt(i))) )
            {
                return false;
            }else{
                hashMap.put(s.charAt(i),t.charAt(i));
                reverseMap.put(t.charAt(i) , s.charAt(i));
            }
        }

        return true;
    }
}
