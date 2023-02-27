public class Q_Five {
    public void half(CircularlyLinkedList list1, CircularlyLinkedList list2){
        if(!isEmpty())
            if(size % 2 == 0){
                int count = 1;
                while(count <= size/2){
                    tail = tail.next;
                    list1.addLast(tail.element);
                    count++;
                }
                while(count <= size){
                    tail = tail.next;
                    list2.addLast(tail.element);
                    count++;
                }
            }
    }
}
