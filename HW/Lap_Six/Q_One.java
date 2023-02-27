public class Q_One {
    public DoublyLinkedList.Node<E> middle(){
        if(header.next == null) return null;
        DoublyLinkedList.Node<E> e = header;
        int i = 0;
        while(e.getNext() != null){
            e = e.getNext();
            i++;
        }
        int m = 0;
        i = i / 2;
        if(i % 2 == 0)
            while(m < i){
                e = e.getPrev();
                m++;
            }
        else
            while(m <= i){
            e = e.getPrev();
            m++;
        }
        return e;
    }
}
