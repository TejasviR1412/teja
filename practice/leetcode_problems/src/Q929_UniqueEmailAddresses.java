import java.util.HashMap;
import java.util.Map;

public class Q929_UniqueEmailAddresses {
    public static int numUniqueEmails(String[] emails) {
        int indexOfAtTheRate, indexOfPlus;
        String before ,after;
        StringBuilder sb = new StringBuilder();
        Map<String , Integer> hashMap = new HashMap<>();

        for(String email : emails){
            indexOfAtTheRate = email.indexOf('@');
            before = email.substring(0,indexOfAtTheRate).replace(".","");

            indexOfPlus = before.indexOf('+');

            if(indexOfPlus != -1)
                before = before.substring(0, indexOfPlus);

            after = email.substring(indexOfAtTheRate);
            sb.append(before).append(after);

            hashMap.put(sb.toString(),hashMap.getOrDefault(sb.toString(),0)+1);

            sb = new StringBuilder();
        }

        return hashMap.size();
    }

    public static void main(String[] args) {
        String[] emails1 = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        String[] emails2 = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        String[] emails3 = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};

        System.out.println(numUniqueEmails(emails1));
        System.out.println(numUniqueEmails(emails2));
        System.out.println(numUniqueEmails(emails3));
    }
}