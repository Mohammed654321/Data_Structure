public class Q_Two {
    public int size(){
        if(header.getNext() == null) return 0;
        int i = 0;
        Node<E> e = header.getNext();
        while(e != trailer){
            e = e.getNext();
            i++;
        }
        return i;
    }
}
