public class Q744_FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters1 = {'c','f','j'};
        char target1 = 'd';

        char[] letters2 = {'c','f','j'};
        char target2 = 'c';

        char[] letters3 = {'x','x','y','y'};
        char target3 = 'z';

        System.out.println(nextGreatestLetter_KK(letters1,target1));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length-1;
        char result = letters[0];

        int mid;

        while(left <= right){
            mid = left + (right-left)/2;

            if(letters[mid] == target)
                left = mid + 1;

            if(target > letters[mid])
                left = mid + 1;
            else if(letters[mid] > target){
                result = letters[mid];
                right = mid -1;
            }

        }
        return result;
    }

    public static char nextGreatestLetter_KK(char[] letters, char target) {
        int left = 0;
        int right = letters.length-1;

        int mid;

        while(left <= right){
            mid = left + (right-left)/2;

            if(target < letters[mid])
                right = mid - 1;
            else
                left = mid + 1;

        }
        return letters[left % letters.length];
    }
}
