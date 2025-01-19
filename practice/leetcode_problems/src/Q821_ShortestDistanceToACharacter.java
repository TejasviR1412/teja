public class Q821_ShortestDistanceToACharacter {
    public static void main(String[] args) {
        String s1 = "loveleetcode";
        char c1 = 'e';

        String s2 = "aaab";
        char c2 = 'b';

        int[] output1 = shortestToChar(s1,c1);
        for(int a : output1){
            System.out.print(a + " ");
        }
        System.out.println();
        int[] output2 = shortestToChar(s2,c2);
        for(int a : output2){
            System.out.print(a + " ");
        }
    }

    public static int[] shortestToChar(String s, char c) {
        int length = s.length();
        int[] answer = new int[length];

        int previous = Integer.MIN_VALUE/2;

        for(int i =0; i<length; i++){
            if(s.charAt(i) == c)
                previous = i;
            answer[i] = previous-i;
        }

        previous = Integer.MIN_VALUE/2;

        for(int i=length-1 ; i >=0 ;i--){
            if(s.charAt(i) == c)
                previous = i;
            answer[i] = Math.min(answer[i],Math.abs(previous -i));
        }

        return answer;
    }
}