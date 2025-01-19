package Learning;

/*
* This is a rolling hash function.
* Slide the window by the pattern length,
* remove the first character & add the i+patternLength char
*
*
* Algo:
*
* 1. Calculate the hash for the pattern.
* 2. Calculate the hash for i to i+patternLength
* 3. if both the hash match:
* 3.1 check if the strings match.
* 3.2 if they do , return the index from where they match
* 4. if the hash does not match , update the hash and check
* */
public class KarpRabinAlgorithm {
    private final int PRIME = 101;

    public static void main(String[] args) {
        String s1 = "cdabcdab";
        String s2 = "abcdabcdabcd";

        KarpRabinAlgorithm algo = new KarpRabinAlgorithm();
        algo.search(s2,s1);
    }

    private double calculateHashValue(String str){
        double hash = 0;

        for(int i=0;i<str.length();i++){
            hash += (str.charAt(i) * Math.pow(PRIME ,i));
        }

        return hash;
    }

    private double updateHash(double prevHash , char oldChar , char newChar, int patternLength){
        double newHash = (prevHash - oldChar)/PRIME;
        newHash += (newChar * Math.pow(PRIME , patternLength-1));

        return newHash;
    }

    public void search(String text , String pattern){
        int patternLength = pattern.length();

        double patternHash = calculateHashValue(pattern);
        double textHash = calculateHashValue(text.substring(0,patternLength));

        for(int i=0; i<=text.length()-patternLength;i++){
            if(textHash == patternHash){
                if(text.substring(i,i+patternLength).equals(pattern)){
                    System.out.println("Pattern found at index " + i);
                }
            }

            if(i < text.length() - patternLength){
                textHash = updateHash(textHash , text.charAt(i) , text.charAt(i+patternLength) , patternLength);
            }
        }
    }
}