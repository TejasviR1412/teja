public class Q3090_MaximumLengthSubstringWithTwoOccurances {
    public int maximumLengthSubstring(String s) {
        int[] charset = new int[26];

        int left = 0;
        int right = 0;
        int result = 0;
        int length;

        while (left <= right && right < s.length()){
            char c = s.charAt(right);
            charset[c - 'a']++;

            if(isValid(charset)){
                length = right - left + 1;
                result = Math.max(result , length);
            }else{
                charset[s.charAt(left) - 'a']--;
                left++;
            }

            right++;
        }

        return result;
    }

    private boolean isValid(int[] charset){
        for(int i=0;i<charset.length;i++){
            if(charset[i] > 2)
                return false;
        }

        return true;
    }
}
