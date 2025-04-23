import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3069_DistributeElementsIntoTwoArrays_1 {
    public static int[] resultArray(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);

        int lastElementInList1 = list1.get(0);
        int lastElementInList2 = list2.get(0);

        for(int i=2;i<nums.length;i++){
            if(lastElementInList1 > lastElementInList2){
                list1.add(nums[i]);
                lastElementInList1 = list1.get(list1.size()-1);
            }else{
                list2.add(nums[i]);
                lastElementInList2 = list2.get(list2.size()-1);
            }
        }

       list1.addAll(list2);

       for(int i=0;i<list1.size();i++){
           nums[i] = list1.get(i);
       }

       return nums;

       //return list1.stream().mapToInt(Integer::intValue).toArray(); --> 182ms
    }
}
