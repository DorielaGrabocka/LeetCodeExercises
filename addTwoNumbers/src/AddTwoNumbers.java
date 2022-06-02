import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = addTwoNumbers(l1,l2);
        printNumber(reverseListNode(l1), "Number 1");
        printNumber(reverseListNode(l2), "Number 2");
        printNumber(result, "result");

    }
    public static void printNumber(ListNode node, String text){
        System.out.println("Printing "+text+" : ");
        while(node !=null){
            System.out.print(node.val);
            node = node.next;
        }
        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumNode = new ListNode();
        ListNode prev = null;
        ListNode lastNode = new ListNode();
        int carry = 0;
        int counter = 0;
        while(l1 !=null || l2 !=null || carry==1){
            if(l1 == null) l1 = new ListNode(0);
            if(l2 == null) l2 = new ListNode(0);
            int sum = l1.val + l2.val + carry;
            if(sum>9){
                sum = sum % 10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            if(l1.next !=null || l2.next != null){
                sumNode = new ListNode();
                sumNode.val = sum;
            }
            else{
                sumNode = new ListNode(sum, null); //last digit
            }
            if(prev!=null) prev.next = sumNode;
            if(counter==0) lastNode = sumNode; //save the last node to reverse the list
            l1 = l1.next;
            l2 = l2.next;
            prev = sumNode;
            counter++;
        }
        return reverseListNode(lastNode);
    }

    private static ListNode reverseListNode (ListNode l){
        System.out.println();
        ListNode prev = null;
        while(l != null){
            ListNode next = l.next;
            if(prev == null){
                l.next = null;
            }
            else{
                l.next = prev;
            }

            prev = l;
            l = next;
        }
        return prev;
    }
    private static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }
}
