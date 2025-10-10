package Ex_05_05_Oct_String;

public class Lab_503_String_Imm {
    static void main(String[] args) {

        //  ==  checks memory location
        //  .equals()  checks content

        String s0="Kumar";      // SCP -> string constant pool
        s0=s0.concat("Bhirud");     // SCP -> string constant pool

        System.out.println(s0);         //KumarBhirud
        String s1="Bhirud";
        String s2="Bhirud";
        String s3= new String("Bhirud");
        String s4= new String("Bhirud");

        System.out.println(s1==s2);         //true---SCP == check momory location
        System.out.println(s1.equals(s2));         //true .equals checks

        System.out.println(s3==s4);         //false
        System.out.println(s3.equals(s4));         //true

        System.out.println(s1==s3);         //false
        System.out.println(s1.equals(s3));         //true

    }
}
