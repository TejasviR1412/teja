import java.util.*;

public class Q1726_TupleWithSameProduct {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4,6};

        int[] nums2 = {1,2,4,5,10};

        System.out.println(tupleSameProduct_Approach1(nums1));
        System.out.println(tupleSameProduct_Approach1(nums2));
        System.out.println("************************************");
        System.out.println(tupleSameProduct_Approach2(nums1));
        System.out.println(tupleSameProduct_Approach2(nums2));
    }

    public static int tupleSameProduct_Approach1(int[] nums) {
        int numsLength = nums.length;
        int numberOfTuples = 0;
        int product;
        Set<Integer> possibleDValues;

        Arrays.sort(nums); //O(n logn)

        //check for all possible values of 'a'
        for(int aIndex=0;aIndex<numsLength;aIndex++){
            for(int bIndex=numsLength-1;bIndex>=aIndex+1;bIndex--){
                product = nums[aIndex] * nums[bIndex];

                possibleDValues = new HashSet<>();

                for(int cIndex= aIndex+1;cIndex<bIndex;cIndex++){
                    if(product%nums[cIndex] == 0){
                        int dValue = product / nums[cIndex];

                        if(possibleDValues.contains(dValue)){
                            numberOfTuples +=8;
                        }

                        possibleDValues.add(nums[cIndex]);
                    }
                }
            }
        }
        return numberOfTuples;
    }

    public static int tupleSameProduct_Approach2(int[] nums) {
        int numsLength = nums.length;
        List<Integer> pairs = new ArrayList<>();
        int numberOfTuples = 0;
        int lastProductSeen = -1;
        int sameProductCount = 0;
        int pairsOfEqualProduct;

        for(int i=0;i<numsLength;i++){
            for(int j=i+1;j<numsLength;j++){
                pairs.add(nums[i] * nums[j]);
            }
        }

        Collections.sort(pairs);

        for(int i=0;i<pairs.size();i++){
            if(pairs.get(i) == lastProductSeen){
                sameProductCount++;
            }else{
                pairsOfEqualProduct = ((sameProductCount-1) * sameProductCount)/2;
                numberOfTuples += 8 * pairsOfEqualProduct;
                lastProductSeen = pairs.get(i);
                sameProductCount = 1;
            }
        }

        pairsOfEqualProduct = ((sameProductCount-1) * sameProductCount)/2;
        numberOfTuples += 8 * pairsOfEqualProduct;
        return numberOfTuples;
    }
}