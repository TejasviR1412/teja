import java.util.HashSet;
import java.util.Set;

public class Q3483_Unique3DigitNumbers {
    //time complexity = O(n^3)
    // space complexity = O(n)
    public int totalNumbers(int[] digits) {
        Set<Integer> integerSet = new HashSet<>();

        for(int i=0;i< digits.length;i++){
            if(digits[i] == 0){
                continue;
            }

            for(int j=0;j<digits.length;j++){
                if(i == j){
                    continue;
                }

                for(int k=0;k< digits.length;k++){
                    if(k == i || k == j)
                        continue;

                    int num = digits[i]*100 + digits[j]*10 + digits[k];

                    if(num % 2 == 0)
                        integerSet.add(num);
                }
            }
        }
        return integerSet.size();
    }
}