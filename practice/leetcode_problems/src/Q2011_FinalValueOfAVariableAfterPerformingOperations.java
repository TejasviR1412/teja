public class Q2011_FinalValueOfAVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] operations1 = {"--X","X++","X++"};
        String[] operations2 = {"++X","++X","X++"};
        String[] operations3 = {"X++","++X","--X","X--"};

        System.out.println(finalValueAfterOperations(operations1));
        System.out.println(finalValueAfterOperations(operations2));
        System.out.println(finalValueAfterOperations(operations3));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int output = 0;

        for(String operation : operations){

            breakSwitch : switch (operation){
                case "X++" -> {
                    output++;
                    break breakSwitch;
                }
                case "X--" -> {
                    output--;
                    break breakSwitch;
                }
                case "++X" -> {
                    ++output;
                    break breakSwitch;
                }
                case "--X" -> {
                    --output;
                    break breakSwitch;
                }
            }
        }
        return output;
    }
}