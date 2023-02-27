public class Q_Two_Find{
    private void find(){ // Q Two
        if(head != null){
           SinglyLinkedList.Node temp = head;
           while(temp.next != null){
               System.out.println(temp.next.getElement());
               temp = temp.next;
           }
        }
        else
        System.out.println("The Linked is Empty");
    }
}
