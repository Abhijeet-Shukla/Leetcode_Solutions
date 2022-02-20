// Difficulty=Easy

class Solution{
  public ListNode middleNode(ListNode head){
    ListNode mid=head,end=head;
    while(end!=null){
      end=end.next;
      if(end==null){
        return mid;
      }
      end=end.next;
      mid=mid.next;
    }
    return mid;
  }
}

// Runtime=0ms
// Memory=42.3MB
