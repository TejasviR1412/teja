public class Q1790_CheckIfOneStringSwapCanMakeStringsEqual {
    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";

        String s3 = "attack";
        String s4 = "defend";

        String s5 = "kelb";
        String s6 = "kelb";

        String s7 = "caa";
        String s8 = "aaz";

        System.out.println(areAlmostEqual(s1,s2));
        System.out.println(areAlmostEqual(s3,s4));
        System.out.println(areAlmostEqual(s5,s6));
        System.out.println(areAlmostEqual(s7,s8));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        int firstIndexDifference = 0;
        int secondIndexDifference = 0;
        int numDifferences = 0;

        for(int i=0; i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                numDifferences++;

                if(numDifferences > 2)
                    return false;
                else if(numDifferences == 1){
                    firstIndexDifference = i;
                }else{
                    secondIndexDifference = i;
                }
            }
        }

        return ((s1.charAt(firstIndexDifference) == s2.charAt(secondIndexDifference))
                && (s1.charAt(secondIndexDifference) == s2.charAt(firstIndexDifference)));
    }
}
