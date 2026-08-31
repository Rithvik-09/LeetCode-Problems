
        if (k == 0) {
            return head;
        }

        tail.next = head;

        int nth = n - k - 1;
        ListNode last = head;

        for (int i = 0; i < nth; i++) {
            last = last.next;
        }

