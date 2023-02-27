public class Q_Three {
    public boolean equals(CircularlyLinkedList c){
        Node<E> one = tail.next;
        Node<E> two = c.tail.next;
        boolean chek = false;
        while(one != tail && two != c.tail){
            if(one.element != two.element)
                return false;
            one = one.next;
            two = two.next;
        }
        if(one == tail && two == c.tail)
            return true;
        else
            return false;
    }
}
