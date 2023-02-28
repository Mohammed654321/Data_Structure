public class Q_Three {
    // the first step is create method in class SinglyLinkedList //
    public void Concatenate(SinglyLinkedList list) {
        tail.setNext(list.head);
        tail = list.tail;
        size += list.size;
        list.size = 0;
    }
    
    // then create method in class SinlyQueue //
    public void signatureConcatenate(SinglyQueue Q2){
        this.list.Concatenate(Q2.list);
    }                  
}
