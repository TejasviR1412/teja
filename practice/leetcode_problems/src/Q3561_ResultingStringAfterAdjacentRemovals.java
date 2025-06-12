import java.util.Stack;

public class Q3561_ResultingStringAfterAdjacentRemovals {
    public String resultingString(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> characterStack = new Stack<>();
        char topCharacter;

        for(char c : s.toCharArray()){
            if(!characterStack.isEmpty()){
                topCharacter = characterStack.peek();

                if((topCharacter=='z' && c=='a') ||
                        (topCharacter=='a' && c=='z') ||
                        (Math.abs(topCharacter-c)==1)){
                    characterStack.pop();
                }else{
                    characterStack.push(c);
                }
            }else{
                characterStack.push(c);
            }
        }

        for(char c : characterStack){
            sb.append(c);
        }
        return sb.toString();
    }
}