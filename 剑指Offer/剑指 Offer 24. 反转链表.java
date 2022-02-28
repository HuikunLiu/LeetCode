/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        Stack<ListNode> stack = new Stack<>();
        ListNode p = head;
        while(p!=null){
            stack.push(p);
            p = p.next;
        }
        head = stack.pop();
        p = head;
        while(!stack.isEmpty()){
            p.next = stack.pop();
            p = p.next;
        }
        p.next = null;
        return head;

    }
}
