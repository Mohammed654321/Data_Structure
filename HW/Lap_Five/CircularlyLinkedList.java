public class CircularlyLinkedList<E> {
    
    public class Node<E>{
        private E element;
        private Node<E> next;
        
        public Node(E e, Node n){
            element = e;
            next = n;
        }
        public E getElement( ) { return element; }
        public Node<E> getNext( ) { return next; }
        public void setNext(Node<E> n) { next = n; }
    }
    
    public Node<E> tail = null;
    public int size = 0;
    
    public boolean isEmpty(){ return size == 0;}
    public void addFirst(E e){
        if(isEmpty()){
            tail = new Node<>(e, null);
            tail.setNext(tail);
        }
        else
            tail.next = new Node<>(e, tail.getNext());
        size++;
    }
    public void addLast(E e){
        addFirst(e);
        tail = tail.getNext();
    }
    
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
            return false;
    }
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
    public void clone(CircularlyLinkedList list){
        if(!isEmpty()){
            Node<E> n = tail;
            while(n.next != tail){
                
                n = n.next;
                list.addLast(n.element);
            }
            list.addLast(tail.element);
        }
    }
    public static void main(String[] args) {
        CircularlyLinkedList ob = new CircularlyLinkedList();
        CircularlyLinkedList ob2 = new CircularlyLinkedList();
        CircularlyLinkedList ob3 = new CircularlyLinkedList();
        
        ob.addLast(1);
        ob.addLast(2);
        ob.addLast(3);
        ob.addLast(4);
        ob.addLast(5);
        ob.addLast(6);

    }
}
