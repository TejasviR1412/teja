public class Q1826_FaultySensor {
    public static void main(String[] args) {
        int[] sensor1 = {2,3,4,5};
        int[] sensor2 = {2,1,3,4};

        int[] sensor3 = {2,2,2,2,2};
        int[] sensor4 = {2,2,2,2,5};

        int[] sensor5 = {2,3,2,2,3,2};
        int[] sensor6 = {2,3,2,3,2,7};
    }

    public static int badSensor(int[] sensor1, int[] sensor2) {
        int pointer1 = 0;
        int pointer2 = 0;

        while(pointer1 < sensor1.length && pointer2 < sensor2.length){
            // If a mismatch is found at an index
            if(sensor1[pointer1] != sensor2[pointer2]){

                // If a match is found by assuming
                // both sensor1 and sensor2 have missed a value,
                // ambiguity is present
                if(matchValues(pointer1,pointer2+1,sensor1,sensor2) &&
                        matchValues(pointer1+1,pointer2,sensor1,sensor2))
                    return -1;
                // Assume sensor1 has missed a value.
                // Try the match for subarrays starting
                // at p1 for sensor1 and p2+1 for sensor2
                else if(matchValues(pointer1,pointer2+1,sensor1,sensor2))
                    return 1;
                // Assume sensor2 has missed a value.
                // Try the match for subarrays starting
                // at p1+1 for sensor1 and p2 for sensor2
                else if(matchValues(pointer1+1,pointer2,sensor1,sensor2))
                    return 2;
            }

            pointer1++;
            pointer2++;
        }

        return -1;
    }

    // Check if subarrays sensor1 (starting at index p1)
    // and sensor2 (starting at index p2) match
    private static boolean matchValues(int p1, int p2 , int[] sensor1, int[] sensor2){
        while(p1 < sensor1.length && p2 < sensor2.length){
            if(sensor1[p1++] != sensor2[p2++])
                return false;
        }
        return true;
    }
}
