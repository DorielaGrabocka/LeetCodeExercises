import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        //ListNode l3 = new ListNode(4);
        //ListNode l2 = new ListNode(2, l3);
        ListNode l1 = null;

        //ListNode l6 = new ListNode(4);
        //ListNode l5 = new ListNode(3, l6);
        ListNode l4 = null;

        ListNode result = mergeTwoLists(l1, l4);

        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode startNode;
        ListNode list1Pointer = list1;
        ListNode list2Pointer = list2;
        if(list1 == null){
            return list2;
        }
        else if(list2 == null){
            return list1;
        }
        else if(list1==null && list2 == null){
            return null;
        }
        if(list1Pointer.val >= list2Pointer.val){
            startNode = list2Pointer;
            list2Pointer = list2Pointer.next;
        }
        else{
            startNode = list1Pointer;
            list1Pointer = list1Pointer.next;
        }
        ListNode currentNode = startNode;
        while(list1Pointer!=null || list2Pointer != null){

            if((list1Pointer!=null && list2Pointer!=null) && (list1Pointer.val >= list2Pointer.val)){
                //System.out.println("Enter if 1");
                currentNode.next = list2Pointer;
                list2Pointer = list2Pointer.next;
            }
            else if ((list1Pointer!=null && list2Pointer!=null) && (list1Pointer.val < list2Pointer.val)){
                //System.out.println("Enter if 2");
                currentNode.next = list1Pointer;
                list1Pointer = list1Pointer.next;
            }
            else{
                //System.out.println("Enter else");
                if(list1Pointer==null){
                    currentNode.next = list2Pointer;
                    list2Pointer = list2Pointer.next;
                }
                else{
                    currentNode.next = list1Pointer;
                    list1Pointer = list1Pointer.next;
                }
            }
            currentNode = currentNode.next;
        }
        return startNode;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
