package Ex_17_Collection_Framework.CF_04_Map;

import java.util.*;

public class Lab244_Map_all_diff {
    static void main(String[] args) {

        // Map is key - value

        Map m1 = new HashMap();

        m1.put("name", "pramod");
        m1.put("rollno", 1);
        m1.put(101,null);
        m1.put(null,"gg");
        m1.put(null,null);
        m1.put("hhh",null);


        System.out.println(m1);

        Map m2=new LinkedHashMap();

        m2.put("name","pramod");
        m2.put("rollno",1);
        m2.put(101,null);
        m2.put(null,"gg");
        m2.put(null,null);
        System.out.println(m2);

        Map m3=new TreeMap();

        m3.put("name","pramod");
        m3.put("rollno",1);
        m3.put("hh",null);

        System.out.println(m3);

        Map m4=new Hashtable();

        m4.put("name","pramod");
        m4.put("rollno",1);
//        m4.put("hh",null);
//        m4.put(null,"gg");
//        m4.put(null,null);    //NullPointerException

        System.out.println(m4);
    }
}
