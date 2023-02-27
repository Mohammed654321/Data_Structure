public class Q_Seven {
    public void clone(DoublyLinkedList M){
        if(!isEmpty() && !M.isEmpty()){
            while(!isEmpty()){
                removeFirst();
            }
            Node<E> m = M.header.getNext();
            while(m != M.trailer){
                addLast(m.getElement());
                m = m.getNext();
            }
        }
    }
}
