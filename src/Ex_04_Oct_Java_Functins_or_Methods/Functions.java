package Ex_04_Oct_Java_Functins_or_Methods;

public class Functions
{
    static void main(String[] args)
    {
        int max=Math.max(20,30);        //Built in

        System.out.println(max);
        method1();
        String s=Method2();
        System.out.println(s);
        Method3(10,20);
        int a= Method4(20,30);
        System.out.println(a);


    }
   static void method1 ()          //Withourt para without return
    {
        System.out.println("From Method 1");
    }
    static String Method2 ()              //Without para with return
     {
         System.out.println("from m2");
         return "Kumar";
     }
     static void Method3 (int x, int y)       //With para without return type
     {
         System.out.println(x+y);
     }
    static int Method4 (int a,int b)     //With para with return type
    {
        return (a+b);
    }
}