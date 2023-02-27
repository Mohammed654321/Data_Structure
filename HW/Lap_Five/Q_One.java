public class Q_One {
    public void addFirst(E e){
        if(isEmpty()){
            tail = new Node<>(e, tail.null);
            tail.setNext(tail);
        }
        else
            tail.next = new Node<>(e, tail.getNext());
        size++;
    }
}
