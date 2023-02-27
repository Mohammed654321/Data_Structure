public class Q_Tow {
    public int size(){
        if(tail == null)
            return 0;
        if(tail.getNext() == tail)
            return 1;
        Node<E> chek = tail.getNext();
        int i = 1;
        while(chek != tail){
            chek = chek.next;
            i++;
        }
        return i;
    }
}
