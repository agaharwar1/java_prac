public class armstrong {
    public static void main(String[] args)
    {
        int n=371, total=0, temp, num;
        num=n;
        while(num!=0)
        {
            temp=num%10;
            total=total+temp*temp*temp;
            num=num/10;
        }
        if(total==num)
            System.out.println(n+" is an armstrong");
        else
            System.out.println(n+" is not an armstrong");

    }

}
