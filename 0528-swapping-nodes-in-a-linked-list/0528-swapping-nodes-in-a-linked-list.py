# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def swapNodes(self, head: ListNode, k: int) -> ListNode:
        first = last = head
        temp = head
        
        # Move first pointer to k-th node
        for _ in range(k - 1):
            first = first.next
        
        # Use a temp pointer to find the length and the k-th node from the end
        temp = first  # This is now the k-th node from the start
        while temp.next:
            last = last.next
            temp = temp.next
        
        # Swap values of the k-th node from start and end
        first.val, last.val = last.val, first.val
        
        return head
