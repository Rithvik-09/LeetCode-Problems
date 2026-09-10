
            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }
        

        return dummy.next;
    }
}
            ListNode second = prev.next.next;
            ListNode first = prev.next;
