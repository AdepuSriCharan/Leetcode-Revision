package leetcode.linkedListCycle_141;

import java.util.HashMap;

public class HasCycleHashMap {
    private static boolean hasCycle(ListNode head){
        if(head == null)
            return false;
        ListNode temp = head;

        HashMap<ListNode, Integer> map = new HashMap<>();

        while (temp != null){
            if (map.containsKey(temp)){
                return true;
            }
            map.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        fourth.next = second;

        boolean hasCycle = hasCycle(head);

        System.out.println("Cycle detected: " + hasCycle);
    }
}
