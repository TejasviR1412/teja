public class Q925_LongPressedName {
    public static void main(String[] args) {
        String name1 = "alex";
        String typed1 = "aaleex";

        String name2 = "saeed";
        String typed2 = "ssaaedd";

        System.out.println(isLongPressedName(name1,typed1));
        System.out.println(isLongPressedName(name2,typed2));
    }

    /*
     * There are 3 cases to be considered after traversing through
     * both the strings "name" and "typed"
     * CASE 1. name.length() == typed.length() -> return true
     *
     * CASE 2. after traversal , there are characters left in "name" -> return false
     *
     * CASE 3. after traversal , there are some characters left in "typed".
     * traverse through the remaining characters and compare
     */
    public static boolean isLongPressedName(String name, String typed) {
        int i = 1;
        int j = 1;

        /*
        * They are 2 different strings
        *
        */
        if(name.charAt(0) != typed.charAt(0))
            return false;

        while(i < name.length() && j<typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else{
                if(typed.charAt(j) == typed.charAt(j-1)){
                    j++;
                }else{
                    return false;
                }
            }
        }

        /*
        * Case 1: both i and j reached the end of the string
        */
        if(i==name.length() && j==typed.length()){
            return true;
        }
        /*
         * Case 2 : there are characters left in "name"
         */
        else if(i != name.length() && j== typed.length())
            return false;
        /*
         * Case 3 : there are some characters left in "typed".
         */
        else{
            while(j!=typed.length()){
                if(typed.charAt(j) == typed.charAt(j-1))
                    j++;
                else
                    return false;
            }
        }
        return true;
    }
}