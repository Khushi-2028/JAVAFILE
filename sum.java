import java.util.Scanner;
public class sum {
    public static void main(String[]args){
        int num1,num2,num3;

        System.out.println("enter first number");
        Scanner sc= new Scanner(System.in);
        num1 =sc.nextInt();

        System.out.println("enter second number");
        num2 =sc.nextInt();

        System.out.println("enter third number");
        num3 =sc.nextInt();

        System.out.println("sum is:" + (num1+num2+num3));

    }
}