/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        
        Stack<Integer> stack = new Stack<>();
        ListNode p = head;
        while(p!=null){
            stack.push(p.val);
            p=p.next;
        }
        int length = stack.size();
        int[] res = new int[length];
        for(int i = 0; i < length; i++) {
            res[i] = stack.pop();
        }
        return res;

    }
}
