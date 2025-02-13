import java.util.Arrays;

public class Q1752_CheckIfAnArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] nums1 = {3,4,5,1,2};
        int[] nums2 = {2,1,3,4};
        int[] nums3 = {1,2,3,4};

        System.out.println(check_Approach1(nums1));
        System.out.println(check_Approach1(nums2));
        System.out.println(check_Approach1(nums3));
        System.out.println("**************************");
        System.out.println(check_Approach2(nums1));
        System.out.println(check_Approach2(nums2));
        System.out.println(check_Approach2(nums3));
    }

    //Sort the array and save it in a sorted array
    // rotate nums and during each rotation check the elements

    /*
    Time complexity : O(n^2) -- nested for loop
    Space Complexity : O(n) -- sortedArray
     */
    public static boolean check_Approach1(int[] nums) {
        int size = nums.length;
        boolean isMatch;

        //create a sorted Array
        int[] sortedArray = nums.clone();
        Arrays.sort(sortedArray);

        //rotate nums and compare it with sortedArray
        for(int i=0;i<size;i++){
            isMatch = true;

            for(int j=0;j<size;j++){
                if(nums[(i+j)%size] != sortedArray[j]){
                    isMatch = false;
                    break;
                }
            }

            if(isMatch)
                return true;
        }

        return false;
    }

    //Check if the array is empty or contains only one element.
    // If so, return true, as a single element or an empty array is trivially sorted.

    //Count the number of inversions (pairs where nums[i] > nums[i + 1]) in the array

    //Compare nums[n - 1] with nums[0]. If nums[0] < nums[n - 1], increment the inversion count.

    //If the total inversion count is less than or equal to 1, return true. Otherwise, return false
    public static boolean check_Approach2(int[] nums) {
        int size = nums.length;

        if(size <=1)
            return true;

        int inversionCount = 0;

        for(int i=1;i<size;i++){
            if(nums[i] < nums[i-1])
                inversionCount++;
        }

        if(nums[0] < nums[size-1])
            inversionCount++;

        return inversionCount<=1;
    }
}