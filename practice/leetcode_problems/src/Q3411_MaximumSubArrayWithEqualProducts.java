public class Q3411_MaximumSubArrayWithEqualProducts {
    public int maxLength(int[] nums) {
        int length = nums.length;
        int maxSubarrayLength = 0;
        int currentGCD , currentLCM , currentProduct;

        for(int i=0;i<length;i++){
            currentGCD = nums[i];
            currentLCM = nums[i];
            currentProduct = nums[i];

            for(int j=i+1;j<length;j++){
                currentProduct *= nums[j];
                currentGCD = gcd(currentGCD , nums[j]);
                currentLCM = lcm(currentLCM , nums[j]);

                if(currentProduct == currentGCD * currentLCM){
                    maxSubarrayLength = Math.max(maxSubarrayLength , j-i+1);
                }
            }
        }

        return maxSubarrayLength;
    }

    private int gcd(int a, int b){
        return b == 0? a : gcd(b , a%b);
    }

    private int lcm(int a , int b){
        return (a / gcd(a,b)) * b;
    }
}