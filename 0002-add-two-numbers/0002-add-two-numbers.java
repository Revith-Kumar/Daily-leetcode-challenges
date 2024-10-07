/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rev = new ListNode();
        ListNode temp = rev;
        int power = 0;
        while(l1!=null || l2!=null){
            int x= (l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int sum = x+y+power;
            power = sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(power>0) temp.next = new ListNode(power);
        return rev.next;
    }
}