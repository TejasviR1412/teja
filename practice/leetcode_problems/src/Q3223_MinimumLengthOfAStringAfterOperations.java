public class Q3223_MinimumLengthOfAStringAfterOperations {
    public static void main(String[] args) {
        String s1 = "abaacbcbb";
        String s2 = "aa";

        System.out.println(minimumLength(s1));
        System.out.println(minimumLength(s2));
    }

    public static int minimumLength(String s) {
        int count = 0;
        int[] characterFrequency = new int[26];

        //count the frequency of each character in the string
        for(char c : s.toCharArray()){
            characterFrequency[c -'a']++;
        }

        for(int frequency : characterFrequency){
            if(frequency == 0)
                continue;

            if(frequency % 2 == 1)
                count +=1;
            else
                count +=2;
        }

        return count;
    }
}
