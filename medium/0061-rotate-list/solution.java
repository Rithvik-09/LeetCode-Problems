class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int n = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        k = k % n;

        if (k == 0) {
            return head;
        }

        tail.next = head;

        int nth = n - k - 1;
        ListNode last = head;

        for (int i = 0; i < nth; i++) {
            last = last.next;
        }

        ListNode newHead = last.next;
        last.next = null;

        return newHead;
    }
}