public class Q_Five {
    public void oneSentinel(){
        trailer.setNext(header.getNext());
        header.getNext().setPrev(trailer);
        header.setNext(null);
    }
}
