public class Q_Six {
    public void clone(CircularlyLinkedList list){
        if(!isEmpty()){
            Node<E> n = tail;
            list.addFirst(n.element);
            while(n.next != tail){
                
                n = n.next;
                list.addFirst(n.element);
            }
        }
    }
}
