package leetcode.mergeKSortedList_23;

import java.util.PriorityQueue;

public class MergeKSortedList {
    public static ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        ListNode temp = new ListNode(-1);
        ListNode tail = temp;

        while (!pq.isEmpty()) {

            ListNode curr = pq.poll();

            tail.next = curr;
            tail = tail.next;

            if (curr.next != null) {
                pq.offer(curr.next);
            }
        }

        return temp.next;
    }
    public static ListNode createList(int[] arr) {

        ListNode temp = new ListNode(-1);
        ListNode tail = temp;

        for (int num : arr) {
            tail.next = new ListNode(num);
            tail = tail.next;
        }

        return temp.next;
    }

    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        ListNode l1 = createList(new int[]{1, 4, 5});
        ListNode l2 = createList(new int[]{1, 3, 4});
        ListNode l3 = createList(new int[]{2, 6});

        ListNode[] lists = {l1, l2, l3};

        ListNode result = mergeKLists(lists);

        System.out.print("Merged List: ");
        printList(result);
    }

}

class ListNode {
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
}


