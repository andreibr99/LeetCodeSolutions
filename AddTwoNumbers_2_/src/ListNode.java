public class ListNode {
    private int item;
    private ListNode next;

    public ListNode(int item, ListNode next) {
        this.item = item;
        this.next = next;
    }

    public ListNode(int item) {
        this(item, null);
    }

    public int print() {
        return item;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(21, new ListNode(5, new ListNode(19, null)));
        System.out.println(list.print());
    }
}