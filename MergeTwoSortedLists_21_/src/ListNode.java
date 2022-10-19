public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode removeDiv2(ListNode list) {

        ListNode head = list;
        while (list.val % 2 != 0) {
            head = list.next;
            list = list.next;
        }

        while (list.next != null) {
            if (list.next.val % 2 != 0) {
                if (list.next.next != null) {
                    list.next = list.next.next;
                } else{
                    break;
                }
            }
            list = list.next;

        }
        return head;
    }
}

