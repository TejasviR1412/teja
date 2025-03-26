public class Q3258_CountSubstringsThatSatisfyKConstraint_I {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        int zeroCount = 0 , oneCount = 0;
        int left = 0, right = 0;

        while (right < s.length()){
           if(s.charAt(right) == '0')
               zeroCount++;
           else
               oneCount++;

           while (zeroCount > k && oneCount > k){
               if(s.charAt(left) == '0')
                   zeroCount--;
               else
                   oneCount--;

               left++;
           }
           count += right - left + 1;
           right++;
        }
        return count;
    }
}