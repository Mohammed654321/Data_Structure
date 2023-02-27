/*  Test  */
public class SinglyLinkedList<E> {
    public class Node<E> {
    
    E element;
    Node<E> next;

    // constructor
    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;
    }

    // methods
    public E getElement() { return element; }

    public Node<E> getNext() { return next; }

    public void setNext(Node<E> next) { this.next = next; }
}
    Node<E> head = null;
    Node<E> tail = null;
    
    int size = 0;
    
    // constructor
    public SinglyLinkedList() {}
    
    // access methods
    public boolean isEmpty() { return size == 0; }
    public E first() { 
        if(isEmpty()) return null;
        return head.getElement();
    }
    public E last() {
        if(isEmpty()) return null;
        return tail.getElement();
    }
    private boolean equals(Node n, Node n2){ // Q One
        if(n == n2){
            if(n.next == n2.next){
                if(n.element == n2.element){
                    return true;
                }
            }
        }
            return false;   
    }
    private void find(){ // Q Two
        if(head != null){
           Node temp = head;
           while(temp.next != null){
               System.out.println(temp.next.getElement());
               temp = temp.next;
           }
        }
        else
        System.out.println("The Linked is Empty");
    }
    private int Size(){ // Q Three
        int numOfElement = 0;
        if(head != null){
            Node temp = head;
            numOfElement++;
            while(temp.next != null){
                numOfElement++;
                temp = temp.next;
            }
            return numOfElement;
        }
        return numOfElement;
    }
    private void rotate(){ // Q Four
        if(!isEmpty()){
            E el = tail.getElement();
            tail.element = head.getElement();
            head.element = el;
        }
    }
    private void revers(){ // Q Sex
        if(head != null){
            Node pre = null;
            Node curr = head, next;
            while(curr != null){
                next = curr.next;
                curr.next = pre;
                pre = curr;
                curr = next;
            }
            tail = head;
            head = pre;
        }
    }
    private void groub(SinglyLinkedList L, SinglyLinkedList M){ // Q Five
        if(!L.isEmpty() && !M.isEmpty()){
            L.tail.next = M.head;
            head = L.head;
            tail = M.tail;
        }
    }
    // update methods
    public void addFirst(E element) {
        head = new Node<>(element, head);
        if(isEmpty())
            tail = head;
        size++;
    }
    public void addLast(E element) {
        Node<E> newElement = new Node<>(element, null);
        if (isEmpty( ))
        head = newElement;
        else
        tail.setNext(newElement);
        tail = newElement;
        size++;
    }
    public E removeFirst() {
        if (isEmpty( )) return null;
        E answer = head.getElement( );
        head = head.getNext( );
        size--;
        if (size == 0)
        tail = null;
        return answer;
    }
    
    public static void main(String[] args) {
        SinglyLinkedList ob = new SinglyLinkedList();
        SinglyLinkedList ob2 = new SinglyLinkedList();
        SinglyLinkedList ob3 = new SinglyLinkedList();
    }
}
