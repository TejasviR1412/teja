public class Q383_RansomNote {
    public static void main(String[] args) {
        String ransomNote1 = "a";
        String magazine1 = "b";

        String ransomNote2 = "aa";
        String magazine2 = "ab";

        String ransomNote3 = "aa";
        String magazine3 = "aab";

        System.out.println(canConstruct(ransomNote1,ransomNote2));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];

        for(char letter : magazine.toCharArray()){
            charCount[letter - 'a']++;
        }

        for(char letter : ransomNote.toCharArray()){
            if(charCount[letter-'a'] == 0)
                return false;

            charCount[letter - 'a']--;
        }

        return true;
    }
}
