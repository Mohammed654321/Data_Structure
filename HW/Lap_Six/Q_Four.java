public class Question_Four {
    public void merge(DoublyLinkedList M){
        if(!isEmpty() && !M.isEmpty()){
            while(!M.isEmpty()){
                addLast((E) M.removeFirst());
            }
        } 
    }
}
