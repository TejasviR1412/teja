import java.util.Arrays;

public class Q2657_FindThePrefixCommonArrayOfTwoArrays {
    public static void main(String[] args) {
        int[] a1 = {1,3,2,4};
        int[] b1 = {3,1,2,4};

        int[] a2 = {2,3,1};
        int[] b2 = {3,1,2};

        int[] a3 = {1,3,2,4,6,7,5};
        int[] b3 = {3,1,2,4,5,6,7};

        System.out.println(Arrays.toString(findThePrefixCommonArray_usingBruteForce(a1,b1)));
        System.out.println(Arrays.toString(findThePrefixCommonArray_usingBruteForce(a2,b2)));
        System.out.println(Arrays.toString(findThePrefixCommonArray_usingBruteForce(a3,b3)));

        System.out.println("*********************");

        System.out.println(Arrays.toString(findThePrefixCommonArray_usingFrequencyArray(a1,b1)));
        System.out.println(Arrays.toString(findThePrefixCommonArray_usingFrequencyArray(a2,b2)));
        System.out.println(Arrays.toString(findThePrefixCommonArray_usingFrequencyArray(a3,b3)));

    }

    public static int[] findThePrefixCommonArray_usingBruteForce(int[] A, int[] B) {
        int length = A.length;
        int[] result = new int[length];
        int common;
        for(int current=0;current<length;current++){
            common = 0;

            for(int i=0; i<=current;i++){
                for(int j=0;j<=current;j++){
                    if(A[i] == B[j]){
                        ++common;
                        break;
                    }
                }
            }

            result[current] = common;
        }
        return result;
    }

    public static int[] findThePrefixCommonArray_usingFrequencyArray(int[] A, int[] B) {
        int length = A.length;
        int[] result = new int[length];
        int[] frequency = new int[length + 1];
        int common = 0;

        for(int i=0;i<length;i++){
            frequency[A[i]] +=1;

            if(frequency[A[i]] == 2)
                ++common;

            frequency[B[i]] +=1;

            if(frequency[B[i]] == 2)
                ++common;

            result[i] = common;
        }
        return result;
    }
}