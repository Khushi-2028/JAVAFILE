import java.util.Scanner;
public class swap {
    public static void main(String []args){
        int a,b,temp;
        Scanner sc = new Scanner(System.in );
        System.out.println("enter first number");
        a= sc.nextInt();
        System.out.println("\nenter secomd number");
        b=sc.nextInt();
          temp = a;
          a = b;
          b= temp;
          System.out.println("\nfirst number: " +a);
          System.out.println("second number: " +b);
    }
}
