/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode current = answer;
        int carry=0;
        while(l1!=null||l2!=null){
            int x = (l1!=null)?l1.val:0;
            int y = (l2!=null)?l2.val:0;
            int sum = carry+x+y;
            carry=sum/10;
            current.next=new ListNode(sum%10);
            current=current.next;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        if(carry>0)
            current.next=new ListNode(carry);
        return answer.next;
    }
}
/*
LinkedList와 계산기를 응용한 문제로

각 계산의 1의 자리 값만을 Node에 남기고 Carry는 다음 자리 계산과 함께 계산한다.


*/
