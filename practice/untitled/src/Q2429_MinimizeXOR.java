/*
1. Count the number of 1s in num2:
This tells us the "weight" we need to match in the result.

2.Match bits in num1 with num2:
Start with the binary representation of num1.
Retain as many 1s as possible from num1 to align with the count from num2.

3. Adjust remaining bits:
if additional 1s are needed, replace 0s in the least significant positions with 1s to minimize the XOR value.
If fewer 1s are needed, turn some 1s in the least significant positions of num1 into 0s.

4. Construct the result:
Using the adjusted bit array, compute the decimal value of the resulting binary number.
This ensures that the resultant number minimizes the XOR value with num1 while having the same number of 1s as num2.
 */
public class Q2429_MinimizeXOR {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;

        int num3 = 1;
        int num4 = 12;

        System.out.println(minimizeXor(num1,num2));
        System.out.println(minimizeXor(num3,num4));
    }

    public static int minimizeXor(int num1, int num2) {
        if(num1 == num2) {
            return num1;
        }
        String bin2 = Integer.toBinaryString(num2);
        String bin1 = Integer.toBinaryString(num1);

        int len  = bin1.length()>bin2.length() ? bin1.length():bin2.length();
        if(bin1.length() > bin2.length()) {
            int additionalZeroes = len - bin2.length();
            for(int i=0;i<additionalZeroes;i++){
                bin2 = "0"+bin2;
            }
        } else {
            int additionalZeroes = len - bin1.length();
            for(int i=0;i<additionalZeroes;i++){
                bin1 = "0"+bin1;
            }
        }

        int[] bin3 = new int[len] ;
        int count1s=  0 ;
        for (int i = 0; i < bin2.length(); i++) {
            if(bin2.charAt(i) == '1'){
                count1s ++;
            }
        }
        for (int i = 0; i < bin1.length(); i++) {
            if(bin1.charAt(i)=='1' && count1s>0){
                bin3[i] = 1;
                count1s--;
            }
        }

        for (int i = len-1; i >=0; i--) {
            if(bin3[i] == 0 && count1s>0){
                count1s--;
                bin3[i] =1;
            }
        }

        int res =0;
        for(int i=len-1;i>=0;i--){
            res += (int) (bin3[i]*Math.pow(2, len-i-1));
        }

        return res;
    }
}