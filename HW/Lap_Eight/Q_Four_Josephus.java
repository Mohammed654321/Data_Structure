public class Q_Four_Josephus {
    public static <E> E Q_Four_Josephus(CircularQueue<E> queue, int k){
        if(queue.isEmpty()) return null;
        while(queue.size() > 1){
            for(int i = 0; i < k-1; i++)
                queue.rotate();
            E e = queue.dequeue();
            System.out.println(" " + e + " is out");
            System.out.println(queue.size());
        }
        return queue.dequeue();
    }
    public static <E> CircularQueue<E> buildQueue(E a[]){
        CircularQueue<E> queue = new CircularQueue<>();
        for(int i = 0; i < a.length; i++)
            queue.enqueue(a[i]);
        return queue;
    }
    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4", "5", "6", "7", "8"};
        System.out.println("First winner is " + Q_Four_Josephus(buildQueue(array), 1));
    }
}
