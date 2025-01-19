public class Q2970_CountTheNumberOfIncremovableSubArrays_I {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {6,5,7,8};
        int[] nums3 = {8,7,6,6};

        System.out.println(incremovableSubarrayCount(nums1));
        System.out.println(incremovableSubarrayCount(nums2));
        System.out.println(incremovableSubarrayCount(nums3));
    }

    public static int incremovableSubarrayCount(int[] nums) {
        int answer = 0;
        int n = nums.length;
        boolean ok;
        int lst;

        for(int i=0 ; i< n;i++){
            for(int j=i;j<n;j++){
                ok = true;
                lst = -1;

                for(int k =0 ; k<n ; k++){
                    if(k >= i && k <= j){
                        continue;
                    }else{
                        ok &= (lst<nums[k]);
                        lst = nums[k];
                    }
                }

                answer += ok ? 1:0;
            }
        }

        return answer;
    }
}
