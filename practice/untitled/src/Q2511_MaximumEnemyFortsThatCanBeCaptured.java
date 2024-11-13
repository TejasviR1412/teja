public class Q2511_MaximumEnemyFortsThatCanBeCaptured {
    public static void main(String[] args) {
        int[] forts1 = {1,0,0,-1,0,0,0,0,1};
        int[] forts2 = {0,0,1,-1};

        System.out.println(captureForts(forts1));
        System.out.println(captureForts(forts2));
    }

    /*
    * Intuition : Find the longest continuous zero between 1 and -1.
    * Approach : Find the longest continuous zero with two pointer.
    * */

    public static int captureForts(int[] forts) {
        int n = forts.length;
        int result = 0;
        for (int i = 0, j = 0; i < n; i++) {
            if (forts[i] != 0) {
                if (forts[i] == -forts[j]) {
                    result = Math.max(result, i - j - 1);
                }
                j = i;
            }
        }

        return result;
    }
}