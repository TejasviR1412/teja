public class Q1652_DefuseTheBomb {
    public int[] decrypt_BruteForceApproach(int[] code, int k) {
        int[] result = new int[code.length];

        if(k == 0)
            return result;

        for(int i=0;i<code.length;i++){
            if(k > 0){
                for(int j = i+1;j<=i+k;j++){
                    result[i] += code[j % code.length];
                }
            }else{
                for(int j = i - Math.abs(k);j<i;j++){
                    result[i] += code[(j + code.length) % code.length];
                }
            }
        }

        return result;
    }

    public int[] decrypt_SlidingWindowApproach(int[] code, int k) {
        int codeLength = code.length;

        int[] result = new int[codeLength];

        if(k == 0)
            return result;

        int start = 1, end = k;
        int windowSum = 0;

        if(k < 0){
            start = codeLength - Math.abs(k);
            end = codeLength - 1;
        }

        for(int i=start ;i<=end ;i++){
            windowSum += code[i];
        }

        for(int i=0;i<codeLength;i++){
            result[i] = windowSum;

            windowSum -= code[start % codeLength];
            windowSum += code[(end + 1) % codeLength];
            start++;
            end++;
        }

        return result;
    }
}