import java.util.Arrays;
import java.util.HashMap;

public class Q1346_CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr1 = {10,2,5,3};
        int[] arr2 = {3,1,7,11};
        int[] arr3 = {7,1,14,11};

        System.out.println(checkIfExist(arr1));
        System.out.println(checkIfExist(arr2));
        System.out.println(checkIfExist(arr3));
    }

    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
       // Arrays.sort(arr);
        for(int i=0; i<arr.length;i++){
            if(map.containsKey(arr[i]*2) ||
                    (arr[i]%2==0 && map.containsKey(arr[i]/2))){
                    return true;
            }else{
                map.put(arr[i],i);
            }
        }
        return false;
    }
}