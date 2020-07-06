package 链表;
 /*删除链表中的节点

         请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。

         现有一个链表 -- head = [4,5,1,9]，它可以表示为:



         示例 1:

         输入: head = [4,5,1,9], node = 5
         输出: [4,1,9]
         解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
*/
public class DeleteNode {
     public static void main(String[] args) {
         ListNode<Integer> listNode=new ListNode( 1 );
         ListNode listNode2=new ListNode( 2 );
         ListNode listNode3=new ListNode( 3 );
         ListNode listNode4=new ListNode( 4 );
         ListNode listNode5=new ListNode( 5 );
         listNode.next=listNode2;
         listNode2.next=listNode3;
         listNode3.next=listNode4;
         listNode4.next=listNode5;
         listNode5.next=null;
         printList(listNode);


         System.out.println("----------------------------");
         deleteNode( listNode3);
         printList(listNode);

     }
     private static void printList(ListNode listNode) {
         StringBuilder stringBuilder=new StringBuilder(  );
         while (listNode!=null){
             stringBuilder.append( listNode.value ).append( "->" );
             listNode=listNode.next;
         }
         System.out.println(stringBuilder);
     }

     public static void deleteNode(ListNode listNode) {

         if(listNode == null) return;
         listNode.value = listNode.next.value;
         listNode.next = listNode.next.next;




     }
}
