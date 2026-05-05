package leetcode.rotateList_61;

class ListNode {
    int val;
    ListNode next;

    ListNode(int v) {
        val = v;
        next = null;
    }
}

public class RotateList {
    private static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode tail = head;
        int n = 1;

        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        tail.next = head;
        k = k % n;

        int step = n - k;
        ListNode newTail = head;

        for (int i = 1; i < step; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }


    static void print(ListNode h) {
        while (h != null) {
            System.out.print(h.val + " ");
            h = h.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);
        h.next.next.next = new ListNode(4);
        h.next.next.next.next = new ListNode(5);

        int k = 2;

        h = rotateRight(h, k);

        print(h);
    }
}