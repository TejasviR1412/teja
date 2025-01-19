public class Q2337_MovePiecesToObtainAString {
    public static void main(String[] args) {
        String start1 = "_L__R__R_";
        String target1 = "L______RR";

        String start2 = "R_L_";
        String target2 = "__LR";

        String start3 = "_R";
        String target3 = "R_";

        System.out.println(canChange(start1,target1));
        System.out.println(canChange(start2,target2));
        System.out.println(canChange(start3,target3));
    }

    /**
     * 'L' pieces can only move left, so their position in the start string must be greater than or equal to their position in the target string.
     *
     * 'R' pieces can only move right, so their position in the start string must be less than or equal to their position in the target string.
     */
    public static boolean canChange(String start, String target) {
        int startLength = start.length();

        int startIndex = 0;
        int targetIndex = 0;

        while(startIndex < startLength || targetIndex < startLength){
           //skip underscores in start
            while(startIndex < startLength && start.charAt(startIndex) == '_'){
                startIndex++;
            }

           //skip underscores in target
            while(targetIndex < startLength && target.charAt(targetIndex) == '_'){
                targetIndex++;
            }

            //if either of the strings are exhausted, both should be exhausted
            if(startIndex == startLength || targetIndex == startLength){
                return startIndex == startLength && targetIndex == startLength;
            }

            if((start.charAt(startIndex) != target.charAt(targetIndex)) ||
               (start.charAt(startIndex) == 'L' && startIndex < targetIndex) ||
               (start.charAt(startIndex) == 'R' && startIndex > targetIndex)){
                return false;
            }

            startIndex++;
            targetIndex++;
        }

        return true;
    }
}
