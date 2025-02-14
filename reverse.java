import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        int number;
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        number = sc.nextInt();
        int answer=0;
        while (number>0)
        {
         int lastdigit = number%10;
         answer = answer *10 + lastdigit;
         number = number / 10;
        }
        System.out.println("reverse number " + answer);
    }
}
