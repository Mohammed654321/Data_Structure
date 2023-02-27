public class Q_Six_Revers{
    private void revers(){
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
}
