public class Q_Four {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10,11,12};
        boolean equal = true;
        
        if(arr == arr2){
            System.out.println("equals");
        }
        else if(arr.length == arr2.length) {
            for(int i=0; i < arr.length; i++){
                if(arr[i] != arr2[i]){
                    equal = true;
                    break;
                }
                else
                    equal = false;
            }
        }
        if(equal)
            System.out.println("not equals");
        else
            System.out.println("equals");
        
    }
}
