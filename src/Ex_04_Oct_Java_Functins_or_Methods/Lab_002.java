package Ex_04_Oct_Java_Functins_or_Methods;

public class Lab_002 {
    static void main(String[] args)
    {
        String name="Kumar";        //String control pool
        String name1="Kumar";
        String s1=new String("Kumar");      //Heap area
        String s2=new String("Kumar");

        System.out.println(name==name1);        //content compare
        System.out.println(name.equals(name1));     //
        System.out.println(name.equals(s1));
        System.out.println(name==s1);
    };
}
