import java.util.Scanner;

public class Q_Five_RoundRobin {

    public static void Q_Five_RoundRobin(CircularQueue<Integer> queue, CircularQueue<Integer> time, int QT){
        int exe = 0;
        while(!queue.isEmpty()){
            int e = queue.dequeue();
            int AT = time.dequeue();
            int BT = time.dequeue();
            for(int i = 1; i <= QT && e != 0; i++){
                e--;
                exe++;
                BT++;
            }
            if(e == 0){
                int TAT = exe - AT;
                int WT = 0;
                if(TAT >= BT){
                    WT = TAT - BT;
                }
                System.out.println("The Element = " + AT);
                System.out.println("The Time is \n" +
                        "AT = " + AT +
                        "\nBT = " + BT +
                        "\nWT = " + WT +
                        "\nTAT = " + TAT);
            }
            else{
                queue.enqueue(e);
                time.enqueue(AT);
                time.enqueue(BT);
            }
        }
    }
    public static void main(String[] args) {
        CircularQueue<Integer> element = new CircularQueue<>();
        CircularQueue<Integer> time = new CircularQueue();
        int QT = 5;
                // the elements must be 0
        element.enqueue(1); 
            time.enqueue(0); // AT
            time.enqueue(0); // BT
        element.enqueue(5);
            time.enqueue(2); // AT
            time.enqueue(0); // BT

            Q_Three_RoundRobin(element, time, QT);
        
    }
}
