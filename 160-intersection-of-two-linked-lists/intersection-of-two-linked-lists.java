/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 import java.util.HashSet;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    HashSet<ListNode> set=new HashSet<>();
    ListNode tempB = headB;
    while(tempB!=null){
        set.add(tempB);
        tempB=tempB.next;

    }
    ListNode tempA= headA;
    while(tempA!=null){
        if(set.contains(tempA))
    {
       return tempA;

    }
     tempA=tempA.next;
    }
    return null;
    }
}

