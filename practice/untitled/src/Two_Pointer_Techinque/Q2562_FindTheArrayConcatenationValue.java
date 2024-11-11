package Two_Pointer_Techinque;

public class Q2562_FindTheArrayConcatenationValue {
    public static void main(String[] args) {
        int[] nums1 = {7,52,2,4};
        int[] nums2 = {5,14,13,8,12};

        System.out.println(findTheArrayConcVal(nums1));
        System.out.println(findTheArrayConcVal(nums2));
    }

    public static long findTheArrayConcVal(int[] nums) {
        long arrayConcatValue = 0L;
        int left = 0 ;
        int right = nums.length-1;
        StringBuilder sb = new StringBuilder();

        while(left <= right){

            if(left == right){
                sb.append(nums[left]);
            }else{
                sb.append(nums[left]).append(nums[right]);
            }

            arrayConcatValue += Long.parseLong(sb.toString());

            sb.replace(0,sb.length(),"");

            left++;
            right--;
        }
        return arrayConcatValue;
    }
}