package Ex_06_05_Oct_StringBuffer_StringBuilder;

public class StringB {
    static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("abc");
//        String s = sb.toString().toUpperCase();        //ABC
//        System.out.println(sb);             //abc
//        System.out.println(s);           //ABC
//
//        String s1=" ";
//        System.out.println(s1.isEmpty());
//
        String s2 = "abcde";
        System.out.println(s2.substring(1, 4));         //bcd
        System.out.println(s2.substring(s2.length()-1));  //e
        System.out.println(s2.substring(3,3));          //""


//        System.out.println(s2.charAt(-1));          //StringIndexOutOfBoundsException


//        String s3="Hello there";
//        System.out.println(s3.indexOf('e'));
//
//        String s4= "abcdefgh";
//        System.out.println(s4.substring(1,4));
//        System.out.println(s4.substring(3));
  //      System.out.println(s4.spl;
//        String s=null;
//        System.out.println(s);
    }
}
