public class Q_One_Equals {
    public boolean equals(Node n, Node n2){
        if(n == n2){
            if(n.next == n2.next){
                if(n.element == n2.element){
                    return true;
                }
            }
        }
            return false;   
    }
}
