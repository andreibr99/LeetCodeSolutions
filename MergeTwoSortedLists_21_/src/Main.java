public class Main {
    public static void main(String[] args) {
        ListNode l2 = new ListNode(1, null);
        addNodeAtEnd(l2, 2);
        addNodeAtEnd(l2, 3);
        addNodeAtEnd(l2, 4);
        print(l2);

        ListNode reverse = reverse3(l2);
        print(reverse);


    }

    public static ListNode reverse(ListNode list) {
        ListNode dummy = new ListNode();
        ListNode head_dummy = dummy;
        ListNode head_list = list;
        while (list != null) {
            if(list.next == null){
                dummy.next = list;
                break;
            } else {
                while (list.next.next != null) {
                    list = list.next;
                }
                dummy.next = list.next;
                list.next = null;
                list = head_list;
                dummy = dummy.next;
            }
        } return head_dummy.next;
    }
    public static ListNode reverse2(ListNode list) {
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        ListNode newList = list;
        dummy.next = list;
        System.out.print("Dummy: ");print(dummy);
        newList=newList.next;
        dummy.next = newList;
        newList.next = list;
        print(head.next);
        /*while(list.next!=null){
                dummy = list;
                dummy.next = head;
                list=list.next;
               // dummy.next = dummy.next.next;

                System.out.print("Dummy: ");
                print(head);
            }*/
        return null;
    }

    static ListNode reverse3(ListNode list)
    {
        if (list == null || list.next == null)
            return list;
        print(list.next.next);
        ListNode rest = reverse3(list.next);
        print(list.next.next);
        list.next.next = list;

        list.next = null;
        print(rest);
        return rest;
    }

/*Node head = list;
    list = newNode;
    list.next = head;*/
    public static ListNode removePrime(ListNode list) {

        ListNode head = list;
        while (isPrime(list.val)) {
            head = list.next;
            list = list.next;
        }

        while (list.next != null) {
            System.out.print("List: ");
            print(list);
            if (isPrime(list.next.val)) {
                if (list.next.next != null) {
                    list.next = list.next.next;
                } else {
                    list.next = null;
                }
            } else {
                list = list.next;
            }

        }
        return head;
    }

    public static ListNode addNodeAtEnd(ListNode list, int value) {
        ListNode newNode = new ListNode(value);
        ListNode head = list;

        while (list.next != null) {
            list = list.next;
        }
        list.next = newNode;
        newNode.next = null;
        return head;
    }

    public static ListNode addNewNode(ListNode sortedList, int value) {
        ListNode newItem = new ListNode(value);
        ListNode head = sortedList;

        if (sortedList == null || value < sortedList.val) {
            newItem.next = sortedList;
            sortedList = newItem;
            return newItem;
        } else {
            while (sortedList.next != null && sortedList.next.val < value) {
                sortedList = sortedList.next;
            }
            newItem.next = sortedList.next;
            sortedList.next = newItem;
        }
        return head;

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        ListNode head = mergedList;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                mergedList.next = list1;
                list1 = list1.next;
            } else {
                mergedList.next = list2;
                list2 = list2.next;
            }
            mergedList = mergedList.next;

        }
        if (list1 != null) {
            mergedList.next = list1;
        } else {
            mergedList.next = list2;
        }
        return head.next;
    }

    public static void print(ListNode list) {
        if (list == null) {
            System.out.println("Lista este goala");
        }
        while (list != null) {
            System.out.print((list.val) + " ");
            list = list.next;
        }
        System.out.println();
    }

    public static boolean isPrime(int value) {
        int count = 0;
        for (int i = 1; i * i <= value; i++) {
            if (value % i == 0) {
                count++;
            }
        }
        if (count == 1 || value == 1) {
            return true;
        } else {
            return false;
        }
    }


}