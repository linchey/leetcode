package 链表;
public class ListNode<T> {

    public  ListNode next;
    public T value;
    public int size;
    public  ListNode(T x){
        value=x;
    }
    //判断是否有下一个节点
    public Boolean hasNext(){
        return this.next==null?false:true;
    }
    public static ListNode getListNode(){
        ListNode<Integer> listNode=new ListNode( 1 );
        ListNode listNode2=new ListNode( 1 );
        ListNode listNode3=new ListNode( 2 );
        ListNode listNode4=new ListNode( 1 );
       // ListNode listNode5=new ListNode( 1);
        listNode.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
       // listNode4.next=listNode5;
       // listNode5.next=null;
        return listNode;
    }
    public static void printList(ListNode listNode) {
        StringBuilder stringBuilder=new StringBuilder(  );
        while (listNode!=null){
            stringBuilder.append( listNode.value ).append( "->" );
            listNode=listNode.next;
        }
        System.out.println(stringBuilder);
    }


}
