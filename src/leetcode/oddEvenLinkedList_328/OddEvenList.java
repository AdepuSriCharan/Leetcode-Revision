package leetcode.oddEvenLinkedList_328;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class OddEvenList {
    private static ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
    public static void main(String[] args) {

        ListNode head1 = createList(new int[]{1, 2, 3, 4, 5});

        ListNode result1 = oddEvenList(head1);

        System.out.print("Output 1: ");
        printList(result1);

        ListNode head2 = createList(new int[]{2, 1, 3, 5, 6, 4, 7});

        ListNode result2 = oddEvenList(head2);

        System.out.print("Output 2: ");
        printList(result2);
    }

    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}
