public class Q_Two {
    public void clone(ArrayQueue array){
        for(int i = 0; i <= size(); i++)
            array.enqueue(dequeue());
    }
}
