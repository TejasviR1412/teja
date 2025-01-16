import java.util.HashSet;
import java.util.Set;

public class Q2168_UniqueSubstringsWithEqualDigitFrequency {
    public static void main(String[] args) {
        String s1 = "1212";
        String s2 = "12321";

        System.out.println(equalDigitFrequency(s1));
        System.out.println(equalDigitFrequency(s2));
    }

    public static int equalDigitFrequency(String s) {
        int n = s.length();
        // Set to store unique substrings with equal digit frequency
        Set<String> validSubstrings = new HashSet<>();

        // Iterate over each possible starting position of a substring
        for (int start = 0; start < n; start++) {
            // Frequency array for digits 0-9
            int[] digitFrequency = new int[10];

            // Extend the substring from 'start' to different end positions
            for (int end = start; end < n; end++) {
                digitFrequency[s.charAt(end) - '0']++;

                // Variable to store the frequency all digits must match
                int commonFrequency = 0;
                boolean isValid = true;

                for (int i = 0; i < digitFrequency.length; i++) {
                    if (digitFrequency[i] == 0) continue; // Skip digits not in the substring
                    if (commonFrequency == 0) {
                        // First digit found, set commonFrequency
                        commonFrequency = digitFrequency[i];
                    }
                    if (commonFrequency != digitFrequency[i]) {
                        // Mismatch in frequency, mark as invalid
                        isValid = false;
                        break;
                    }
                }

                // If the substring is valid, add it to the set
                if (isValid) {
                    String substring = s.substring(start, end + 1);
                    validSubstrings.add(substring);
                }
            }
        }

        // Return the number of unique valid substrings
        return validSubstrings.size();
    }
}