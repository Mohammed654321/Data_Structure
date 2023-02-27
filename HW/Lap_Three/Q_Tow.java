import java.util.Arrays;

public class Q_Two {
    String name;
    int age;
    int id;

    public Q_Two(String name, int old, int id) {
        this.name = name;
        this.age = old;
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "{ name : " + name
                + ", age : " + age
                + ", ID : " + id + " }";
    }
    public static void main(String[] args) {
        
        Q_Two[] arr = new Q_Two[2];
        arr[0] = new Q_Two("ali", 35, 133);
        arr[1] = new Q_Two("khaled", 22, 127);
        
        Q_Two[] arr2 = new Q_Two[arr.length];
        arr2 = arr;
        
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i].toString());
        }
    }
}
