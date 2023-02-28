public class Q_Four{
    public void clone(ArrayStack array){
        ArrayStack arr = new ArrayStack();
        while(!array.isEmpty())
            arr.push(array.pop());
        while(!arr.isEmpty())
            push((E) arr.pop());
    }
}
