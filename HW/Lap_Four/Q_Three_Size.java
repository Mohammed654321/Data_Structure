public class Q_Three_Size {
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
}
