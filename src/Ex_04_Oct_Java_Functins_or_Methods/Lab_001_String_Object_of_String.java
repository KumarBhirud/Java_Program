package Ex_04_Oct_Java_Functins_or_Methods;

public class Lab_001_String_Object_of_String {

    static void main(String[] args) {
            String str="Akash";
            String s1= new String("Akash");
            String s2= new String("Akash");
            String s3=new String("akash");
            String s4="Akash";

            //   System.out.println(str==s4);
            //   System.out.println(str.equals(s4));


            System.out.println(str.hashCode());
            System.out.println(s4.hashCode());

            System.out.println("");
            System.out.println(System.identityHashCode(str));
            System.out.println(System.identityHashCode(s4));


            //  System.out.println(s1==s2);
            // System.out.println(s1.equals(s2));
    }
}
