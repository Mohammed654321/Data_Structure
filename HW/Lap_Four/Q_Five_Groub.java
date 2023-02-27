public class Q_Five_Groub {
    private void groub(SinglyLinkedList L, SinglyLinkedList M){
        if(!L.isEmpty() && !M.isEmpty()){
            L.tail.next = M.head;
            head = L.head;
            tail = M.tail;
        }
    }
}
