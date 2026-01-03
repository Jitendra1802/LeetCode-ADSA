/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // if(node<0 || node>size){
        //     return;
        // }
        // ListNode temp=head;
        // for(int i=0;i<node-1;i++){
        //     temp=temp.next;
        // }
        // temp.next=temp.next.next;
        // return;

        node.val=node.next.val;
        node.next=node.next.next;
    }
}