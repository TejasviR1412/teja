import java.util.Stack;

public class Q1598_CrawlerLogFolder {
    public static void main(String[] args) {
        String[] logs1 = {"d1/","d2/","../","d21/","./"};
        String[] logs2 = {"d1/","d2/","./","d3/","../","d31/"};
        String[] logs3 = {"d1/","../","../","../"};
        String[] logs4 = {"./","../","./"};

        System.out.println(minOperations(logs1));
        System.out.println(minOperations(logs2));
        System.out.println(minOperations(logs3));
        System.out.println(minOperations(logs4));
    }

    public static int minOperations(String[] logs) {
        Stack<String> folderStack = new Stack<>();

        for(String folderPath : logs){
            if(folderPath.equals("../")){
                if(!folderStack.isEmpty())
                    folderStack.pop();
                else
                    continue;
            }else if(folderPath.equals("./"))
                continue;
            else
                folderStack.push(folderPath);

        }

        return folderStack.size();
    }
}