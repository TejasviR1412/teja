public class Q2109_AddingSpacesToAString {
    public static void main(String[] args) {
        String s1 = "LeetcodeHelpsMeLearn";
        int[] spaces1 = {8,13,15};

        String s2 = "icodeinpython";
        int[] spaces2 = {1,5,7,9};

        String s3 = "spacing";
        int[] spaces3 = {0,1,2,3,4,5,6};

        System.out.println(addSpaces(s1 , spaces1));
        System.out.println(addSpaces(s2,spaces2));
        System.out.println(addSpaces(s3,spaces3));
    }

    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int spaceIndex = 0;
        for(int stringIndex=0; stringIndex<s.length();stringIndex++){
            if(spaceIndex<spaces.length && stringIndex == spaces[spaceIndex]){
                sb.append(' ');
                spaceIndex++;
            }
            sb.append(s.charAt(stringIndex));
        }

        return sb.toString();
    }
}
