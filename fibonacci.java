import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args)
    {
         int n, a=0, b=0, c=1;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the value of n:") ;
        n=s.nextInt();
        System.out.println("Fibonacci series:");
        for(int i=1;i<=10;++i)
        {
            a=b;
            b=c;
            c=a+b;
        System.out.println(a+" ");
        }

    }
}
