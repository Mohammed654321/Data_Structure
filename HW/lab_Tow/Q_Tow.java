import java.util.Arrays;

public class Q_Tow {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,12,13,15,17};
        int[] arr2 = new int[10];
        
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        
        System.out.println(Arrays.toString(arr2));
    }
}
