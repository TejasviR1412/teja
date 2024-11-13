public class Q1290_ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(1);
        sl1.insert(0);
        sl1.insert(1);
        sl1.insert(1);
        sl1.display(sl1.head);

        Q1290_ConvertBinaryNumberInALinkedListToInteger q1290 = new Q1290_ConvertBinaryNumberInALinkedListToInteger();
        System.out.println(q1290.getDecimalValue(sl1.head));
    }

    public int getDecimalValue(SinglyLinkedList.ListNode head) {
        int decimalNumber = 0;
        int power = 0;
        StringBuilder sb = new StringBuilder();
        String binaryNumber;

        while(head != null){
            sb.append(head.val);
            head = head.next;
        }

        binaryNumber = sb.toString(); // 1011

        for(int i = binaryNumber.length()-1;i>=0;i--){
            if(binaryNumber.charAt(i)=='1'){
                decimalNumber += Math.pow(2,power);
            }
            power++;
        }
        return decimalNumber;
    }
}