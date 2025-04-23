public class Q3079_FindTheSumOfEncryptedIntegers {
    public int sumOfEncryptedInt(int[] nums) {
        int sumOfEncryptedElements = 0;
        int largestDigit, currentElement , countOfDigits , temp , encryptedNumber;

        for (int num : nums) {
            largestDigit = 0;
            currentElement = num;
            countOfDigits = 0;

            while (currentElement > 0) {
                temp = currentElement % 10;
                currentElement = currentElement / 10;
                largestDigit = Math.max(largestDigit, temp);
                countOfDigits++;
            }

            encryptedNumber = largestDigit;

            while (countOfDigits > 1) {
                encryptedNumber = encryptedNumber * 10 + largestDigit;
                countOfDigits--;
            }

            sumOfEncryptedElements += encryptedNumber;
        }
        return sumOfEncryptedElements;
    }
}