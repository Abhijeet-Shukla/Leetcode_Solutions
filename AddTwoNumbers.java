// Difficulty=Medium

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode Finale=new ListNode();
        ListNode res=Finale;
        int carry=0;
		
        while(l1!=null || l2!=null || carry!=0){
            int val1=l1!=null?l1.val:0;
            int val2=l2!=null?l2.val:0;
            int sum=val1+val2+carry;
            carry=sum/10;
            sum=sum%10;
            res.next=new ListNode(sum);
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
            res=res.next;
        }
        return Finale.next;        
    }
}

// Runtime=4ms
// Memory=47.2MB
