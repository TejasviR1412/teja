import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q703_KthLargestElementInAStream_Approach1 {
    private List<Integer> stream;
    private int k;

    public Q703_KthLargestElementInAStream_Approach1(int k, int[] nums) {
        stream = new ArrayList<>(nums.length);
        this.k = k;

        for(int num: nums){
            stream.add(num);
        }

        Collections.sort(stream);
    }

    public int add(int val) {
        int index = getIndex(val);
        stream.add(index,val);

        return stream.get(stream.size() - k);
    }

    private int getIndex(int val){
        int left = 0;
        int right = stream.size() - 1;
        int mid, middleElement;

        while(left <= right){
            mid = left + (right-left)/2;
            middleElement = stream.get(mid);

            if(middleElement == val)
                return mid;
            else if(middleElement > val)
                right = mid - 1;
            else left = mid + 1;
        }

        return left;
    }

    public static void main(String[] args) {
        Q703_KthLargestElementInAStream_Approach1 q703 = new Q703_KthLargestElementInAStream_Approach1(3, new int[]{4,5,8,2});
        System.out.println(q703.add(3));
        System.out.println(q703.add(5));
        System.out.println(q703.add(10));
        System.out.println(q703.add(9));
        System.out.println(q703.add(4));
    }
}
