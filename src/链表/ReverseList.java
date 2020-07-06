package 链表;

//反转链表
public class ReverseList {
    public static void main(String[] args) {
       /* LinkedList<ListNode> list=new LinkedList<>();
        for (int i=0;i<5;i++){
            ListNode node=new ListNode( i );
            list.add( node );
        }
        StringBuilder stringBuilder=new StringBuilder(  );
       for (ListNode node:list){

           if(list.getLast()!=node){
               stringBuilder.append( node.val ).append( "->" );
           }else{
               stringBuilder.append( node.val ).append( "->null" );

           }
       }
        System.out.println(stringBuilder);*/
       ListNode<Integer> listNode=ListNode.getListNode();

        ListNode.printList(listNode);
        System.out.println("----------------------------");
        ListNode.printList(reverseList( listNode ));


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


