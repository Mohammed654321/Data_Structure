public class Q_Four {
    public boolean equalsDfferentStartingPoints(CircularlyLinkedList c){
        Node<E> one = tail.next;
        Node<E> two = c.tail.next;
        while(two != c.tail){
            if(one.element == two.element)
                break;
            two = two.next;
        }
        while(one.element == two.element && two != c.tail){
            one = one.next;
            two = two.next;
        }
        if(one.element != two.element)
            return false;
        
            return true;
    }
}
