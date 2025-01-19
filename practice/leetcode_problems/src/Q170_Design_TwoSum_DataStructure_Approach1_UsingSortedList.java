import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* Complexity Analysis

Time Complexity:
For the add(number) function: O(1), since we simply append the element into the list.
*
For the find(value) function: O(N⋅log(N)).
In the worst case, we would need to sort the list first, which is of O(N⋅log(N)) time complexity normally.
And later, again in the worst case we need to iterate through the entire list, which is of O(N) time complexity.
As a result, the overall time complexity of the function lies on O(N⋅log(N)) of the sorting operation, which dominates over the later iteration part.

Space Complexity: the overall space complexity of the data structure is O(N)
where N is the total number of numbers that have been added.

*/
public class Q170_Design_TwoSum_DataStructure_Approach1_UsingSortedList {
    private List<Integer> numbers ;
    private boolean isSorted;

    public Q170_Design_TwoSum_DataStructure_Approach1_UsingSortedList() {
        this.numbers = new ArrayList<>();
        this.isSorted = false;
    }

    public void add(int number) {
        this.numbers.add(number);
        this.isSorted = false;
    }

    public boolean find(int value) {
        if(!this.isSorted){
            Collections.sort(this.numbers);
            isSorted = true;
        }

        int left =0;
        int right = this.numbers.size()-1;

        while(left < right){
            int twoSum = this.numbers.get(left) + this.numbers.get(right);

            if(twoSum < value)
                left++;
            else if(twoSum > value)
                right--;
            else
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Q170_Design_TwoSum_DataStructure_Approach1_UsingSortedList q = new Q170_Design_TwoSum_DataStructure_Approach1_UsingSortedList();
        q.add(1);
        q.add(3);
        q.add(5);
        System.out.println(q.find(4));
        System.out.println(q.find(7));
    }
}
