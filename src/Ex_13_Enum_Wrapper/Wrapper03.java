package Ex_13_Enum_Wrapper;

public class Wrapper03 {

    static void main(String[] args) {
        String num = "10";
        int aa = 10;
        double dd=15.15;
   //     boolean bb=true;
        String s1="kumar";
        String s3="15.5";

        // String -> Wrapper Conversion
        Integer a = Integer.parseInt(num);
        System.out.println(a);

        // String to Primitive
        String s2="25";
        int ws2=Integer.parseInt(s2);
        System.out.println(ws2);

        //  Wrapper to Sting

        Integer wa1=33;
        String swa1=String.valueOf(wa1);
        System.out.println(swa1);


        //  Primitive to String

        double db=15.25;
        String sw2=String.valueOf(db);
        System.out.println(sw2);

        boolean bb=true;
        String sbn=String.valueOf(bb);
        System.out.println(sbn);



    }

}
