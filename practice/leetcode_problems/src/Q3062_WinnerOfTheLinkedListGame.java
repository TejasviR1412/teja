import java.util.Arrays;

public class Q3062_WinnerOfTheLinkedListGame {
    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        sl1.insert(2);
        sl1.insert(1);
        sl1.display(sl1.head);

        SinglyLinkedList sl2 = new SinglyLinkedList();
        sl2.insert(2);
        sl2.insert(5);
        sl2.insert(4);
        sl2.insert(7);
        sl2.insert(20);
        sl2.insert(5);
        sl2.insert(30);
        sl2.insert(5);
        sl2.display(sl2.head);

        Q3062_WinnerOfTheLinkedListGame q3062 = new Q3062_WinnerOfTheLinkedListGame();
        System.out.println(q3062.gameResult(sl1.head));
        System.out.println(q3062.gameResult(sl2.head));
    }

    public String gameResult(SinglyLinkedList.ListNode head) {
        int evenCountWins = 0;
        int oddCountWins = 0;

        SinglyLinkedList.ListNode evenNode = head;

        while(evenNode != null && evenNode.next!=null){
            if(evenNode.val > evenNode.next.val)
                evenCountWins++;
            else
                oddCountWins++;

            evenNode = evenNode.next.next;
        }

        return (evenCountWins > oddCountWins) ? "Even" : (oddCountWins > evenCountWins)?"Odd":"Tie";
    }
}