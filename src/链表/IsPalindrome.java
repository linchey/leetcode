package 链表;
/*
  回文链表

          请判断一个链表是否为回文链表。

          示例 1:

          输入: 1->2
          输出: false

          示例 2:

          输入: 1->2->2->1
          输出: true
*/


public class IsPalindrome {
/*
    思路1：反转链表，与原链表比较
*/
    public static void main(String[] args) {
        ListNode listNode=ListNode.getListNode();
        ListNode.printList( listNode );
        System.out.println(isPalindrome( listNode ));
    }
    public static boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode temp=copyList(head);
        ListNode.printList( temp );
        ListNode listNode=reverseList( head );
        ListNode.printList( listNode );
        return compareList(listNode,temp);
    }

    private static ListNode copyList(ListNode head) {
        ListNode node=new ListNode( 0 );
        node.next=head;
        return node.next;
    }

    private static boolean compareList(ListNode listNode, ListNode head) {
        if(listNode==null||head==null)return false;
        while (listNode!=null&&head!=null){
            if(listNode.value!=head.value){
                return false;
            }else{
                listNode=listNode.next;
                head=head.next;
            }

        }
        return true;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode<Integer> node=null;
        while (head!=null){
            ListNode next=head.next;
            head.next=node;
            node=head;
            head=next;
        }
        return node;
    }

}
