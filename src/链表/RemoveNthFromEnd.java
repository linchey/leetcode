package 链表;
/*删除链表的倒数第N个节点

        给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。*/
public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode listNode=new ListNode( 0 );
        listNode.next=head;
        ListNode first=listNode;
        ListNode second=listNode;
        for (int i=1;i<=n+1;i++){
            first=first.next;
        }
        while (first!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode listNode=ListNode.getListNode();
        ListNode.printList( listNode );
        ListNode.printList(removeNthFromEnd( listNode,2 ));

    }
}
