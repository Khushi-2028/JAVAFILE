
public class operator {

    public operator(String rahul, String ankhush) {
    }
    public int add(int n1, int n2){
        return n1+n2;

    }
    public String add(String s1, String s2){

        return s1+s2;
    }
    void display()
    {
        System.out.println(n1+" "+s1+" "+n2+" "+s2);

    }
    public static void main(String []args){
        operator obj1 =new operator (111,112);

        obj1.display();
        
    }
}
