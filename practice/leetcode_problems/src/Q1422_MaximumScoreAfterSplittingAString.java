public class Q1422_MaximumScoreAfterSplittingAString {
    public static void main(String[] args) {
        String s1 = "011101";
        String s2 = "00111";
        String s3 = "1111";
        String s4 = "00";
        String s5 = "11";

        System.out.println(maxScore_bruteForce(s1));
        System.out.println(maxScore_bruteForce(s2));
        System.out.println(maxScore_bruteForce(s3));
        System.out.println(maxScore_bruteForce(s4));
        System.out.println(maxScore_bruteForce(s5));
        System.out.println("==============================");
        System.out.println(maxScore(s1));
        System.out.println(maxScore(s2));
        System.out.println(maxScore(s3));
        System.out.println(maxScore(s4));
        System.out.println(maxScore(s5));
    }

    //brute force approach
    public static int maxScore_bruteForce(String s) {
        int maximumScore = 0;
        int current;
        for (int i = 0; i < s.length()-1; i++) {
            current = 0;

            for(int j=0;j<=i;j++){
                if(s.charAt(j) == '0'){
                    current++;
                }
            }

            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j) == '1'){
                    current++;
                }
            }

            maximumScore = Math.max(maximumScore,current);
        }

        return maximumScore;
    }

    public static int maxScore(String s) {
        int ones = 0;
        int zeros = 0;
        int best = Integer.MIN_VALUE;

        for(int i=0; i< s.length()-1;i++){
            if(s.charAt(i) == '1')
                ones++;
            else
                zeros++;

            best = Math.max(best,zeros-ones);
        }

        if(s.charAt(s.length()-1) == '1')
            ones++;

        return best+ones;
    }
}