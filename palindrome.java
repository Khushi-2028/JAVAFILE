import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int number;
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        number = sc.nextInt();
        int reversednumber=0,temp=number;
        while(temp>0)
        {
            int remainder = temp%10;
            reversednumber = reversednumber *10 +remainder;
            temp = temp/10;
            
        }
        System.out.println("reversed number " +reversednumber);
if(number==reversednumber)
{
    System.out.println("number is palindrome number");
        }else
        System.out.println("number is not a palindrome number");
    }
}
    

