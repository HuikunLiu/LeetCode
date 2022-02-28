/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    private Map<Node,Node> map = new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node newNode = new Node(head.val);
        map.put(head,newNode);
        newNode.next = copyRandomList(head.next);
        newNode.random = map.get(head.random);

        return newNode;
        
    }
}
