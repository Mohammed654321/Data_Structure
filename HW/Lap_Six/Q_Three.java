public class Q_Three {
    public boolean equals(DoublyLinkedList list){
        if(this == list)
            return true;
        else if(this.size() == list.size()){
            Node<E> e = this.header.getNext();
            Node<E> e2 = list.header.getNext();
            while(e != null){
                if(e.getElement() != e2.getElement())
                    return false;
                e = e.getNext();
                e2 = e2.getNext();
            }
            return true;
        }
        return false;
    }
}
