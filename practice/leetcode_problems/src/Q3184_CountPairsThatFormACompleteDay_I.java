public class Q3184_CountPairsThatFormACompleteDay_I {
    public int countCompleteDayPairs_Approach1(int[] hours) {
        int count = 0;

        for(int i=0;i<hours.length-1;i++){
            for(int j=i+1;j<hours.length;j++){
                if((hours[i] + hours[j]) % 24 == 0){
                    count++;
                }
            }
        }

        return count;
    }
}