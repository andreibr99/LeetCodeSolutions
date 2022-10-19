public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        System.out.println(l1.toString());
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        System.out.println(l2.toString());
    }

    public static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        }
    }

    public static class ListNode {
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

        public String toString() {
            String result = String.valueOf(val);
            if (next != null) {
                result += next.toString();
            }
            return result;
        }
    }
}