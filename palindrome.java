public class palindrome {
public static void main(String[] args)
{
    int n=121, ri=0, rem, oi;
    oi=n;
    while(n!=0)
    {
         rem=n%10;
         ri=ri*10+rem;
         n=n/10;
    }
    if(oi==ri)
        System.out.println(oi+"is a palindrome");
    else
        System.out.println(oi+"is not a palindrome");

}}
