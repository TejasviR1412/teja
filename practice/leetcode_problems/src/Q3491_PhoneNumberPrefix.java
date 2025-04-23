import java.util.Arrays;

public class Q3491_PhoneNumberPrefix {
    //Time complexity : O(n^2)
    public boolean phonePrefix_Approach1(String[] numbers) {
        for(int i=0;i<numbers.length-1;i++){
            String firstNumber = numbers[i];

            for(int j=i+1;j<numbers.length;j++){
                String secondNumber = numbers[j];

                if(firstNumber.startsWith(secondNumber) || secondNumber.startsWith(firstNumber))
                    return false;
            }
        }
        return true;
    }

    //Time Complexity : O(n log n)
    public boolean phonePrefix_Approach2(String[] numbers) {
        Arrays.sort(numbers);

        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i+1].startsWith(numbers[i]))
                return false;
        }
        return true;
    }
}