package Two_Pointer_Techinque;

import java.util.Arrays;

public class Q3194_MinimumAverageOfSmallestAndLargestElements {
    public static void main(String[] args) {
        int[] nums1 = {7,8,3,4,15,13,4,1};
        int[] nums2 ={1,9,8,3,10,5};
        int[] nums3 = {1,2,3,7,8,9};

        System.out.println(minimumAverage(nums1));
        System.out.println(minimumAverage(nums2));
        System.out.println(minimumAverage(nums3));
    }

    public static double minimumAverage(int[] nums) {
        int length = nums.length;
        double[] averages = new double[length/2];

        Arrays.sort(nums); // O(NlogN)

        for(int i= 0;i<length/2;i++){ //O(N/2)
            averages[i] = (nums[i] + nums[length-i-1])/2.0;
        }

        Arrays.sort(averages); //O(NlogN)

        return findMinElement(averages);
    }

    private static double findMinElement(double[] nums){
        double minElement = Integer.MAX_VALUE;

        for(int i=0; i< nums.length ; i++){ //O(N/2)
            if(nums[i] < minElement)
                minElement = nums[i];
        }

        return minElement;
    }
}
