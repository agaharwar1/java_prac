public class thispointer {
    int a;
    int b;
     public void setData(int a,int b) {
         this.a = a;
         this.b = b;
     }
     public void showdata(){
         System.out.println("value of a:"+a);
         System.out.println("value of b:"+b);
     }
     public static void main(String[] args)
     {
         thispointer obj=new thispointer();
         obj.setData(2,3);
         obj.showdata();
     }
}
