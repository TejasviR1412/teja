public class Q1400_ConstructKPalindromeStrings {
    public static void main(String[] args) {
        String s1 = "annabelle";
        int k1 = 2;

        String s2 = "leetcode";
        int k2 = 3;

        String s3 = "true";
        int k3 = 4;

        System.out.println(canConstruct(s1,k1));
        System.out.println(canConstruct(s2,k2));
        System.out.println(canConstruct(s3,k3));
    }

    public static boolean canConstruct(String s, int k) {
        int length = s.length();
        int oddCount = 0;
        int[] frequencyCount = new int[26];

        if(length < k)
            return false;

        if(length == k)
            return true;

        for(char c : s.toCharArray()){
            frequencyCount[c - 'a']++;
        }

        for(int count : frequencyCount){
            if(count % 2 == 1)
                oddCount++;
        }

        return oddCount<=k;
    }
}