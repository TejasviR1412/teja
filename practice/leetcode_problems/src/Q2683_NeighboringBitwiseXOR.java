public class Q2683_NeighboringBitwiseXOR {
    public static void main(String[] args) {
        int[] derived1 = {1,1,0};
        int[] derived2 = {1,1};
        int[] derived3 = {1,0};

        System.out.println(doesValidArrayExist_UsingCumulativeXORProperty(derived1));
        System.out.println(doesValidArrayExist_UsingCumulativeXORProperty(derived2));
        System.out.println(doesValidArrayExist_UsingCumulativeXORProperty(derived3));
        System.out.println("********************");
        System.out.println(doesValidArrayExist(derived1));
        System.out.println(doesValidArrayExist(derived2));
        System.out.println(doesValidArrayExist(derived3));
    }

    /**
     * Observe the following equations that represent the relationship between the elements of the derived and original arrays:
     * derived[0] = original[0] XOR original[1]
     * derived[1] = original[1] XOR original[2]
     * derived[2] = original[2] XOR original[3]
     * derived[3] = original[3] XOR original[4]
     * ...
     * derived[n-1] = original[n-1] XOR original[0]
     *
     * Each element in original appears exactly twice in the equations: once as original[i] and once as original[i+1]. For example:
     *
     * original[0] appears in derived[0] (original[0] XOR original[1])
     * original[0] also appears in derived[n-1] (original[n-1] XOR original[0])
     *
     * Since XOR is both commutative and associative, the order doesn’t matter.
     * When all occurrences of original[i] are XORed together, they cancel each other out:
     * original[0] XOR original[0] XOR original[1] XOR original[1] ... = 0
     *
     * If the derived array is valid (i.e., it was generated from some original), then the XOR of all elements in derived must be 0.
     * This is because all elements of original cancel out when XORed.
     */
    public static boolean doesValidArrayExist_UsingCumulativeXORProperty(int[] derived) {
        int XOR = 0;

        for(int derivedElement : derived){
            XOR ^= derivedElement;
        }

        return XOR == 0;
    }

    /**
     *
     * The XOR of two binary numbers produces a result based on their bits
     * 0 XOR 0 = 0
     * 1 XOR 1 = 0
     * 0 XOR 1 = 1
     * 1 XOR 0 = 1
     *
     * For an XOR operation to result in a balanced and valid sequence,
     * the total number of 1s in the derived array (which represents mismatched bits) must be even.
     * This is because each 1 in derived corresponds to a mismatch between adjacent elements in the original array,
     * and mismatches can only be resolved in pairs.
     * The sum of the elements in derived gives the total count of 1s in the array.
     *
     * If the sum is even, it means that the mismatches can be paired and resolved, allowing us to construct a valid original array.
     * If the sum is odd, it’s impossible to resolve the mismatches, and no valid original array can exist.
     */
    public static boolean doesValidArrayExist(int[] derived) {
        int sum = 0;

        for(int derivedElement : derived){
            sum += derivedElement;
        }

        return sum % 2 ==0;
    }
}
