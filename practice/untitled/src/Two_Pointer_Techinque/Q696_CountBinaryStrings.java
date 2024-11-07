package Two_Pointer_Techinque;

public class Q696_CountBinaryStrings {
    public static void main(String[] args) {
        String s1 = "00110011";
        String s2 = "10101";

        System.out.println(countBinarySubstrings_Approach1(s1));
        System.out.println(countBinarySubstrings_Approach1(s2));

        System.out.println(countBinarySubstrings_Approach2(s1));
        System.out.println(countBinarySubstrings_Approach2(s2));
    }

    public static int countBinarySubstrings_Approach1(String s) {
        int[] groups = new int[s.length()];
        groups[0] = 1;
        int t = 0;

        for(int i =1 ; i<s.length() ;i++){
            if(s.charAt(i-1) != s.charAt(i)){
                groups[++t] = 1;
            }else{
                groups[t]++;
            }
        }

        int answer = 0;

        for(int i =1 ; i<=t; i++){
            answer += Math.min(groups[i-1] , groups[i]);
        }

        return answer;
    }

    public static int countBinarySubstrings_Approach2(String s) {
        int answer =0;
        int previous = 0;
        int current = 1;

        for(int i =1 ; i< s.length() ; i++){
            if(s.charAt(i-1) != s.charAt(i)){
                answer+= Math.min(previous,current);
                previous = current;
                current = 1;
            }else{
                current++;
            }
        }
        return answer + Math.min(previous,current);
    }
}
