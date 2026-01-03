package Ex_17_Collection_Framework.CF_01_LIST;

import java.util.Vector;

public class Lab229_Vector {
    static void main(String[] args) {

        Vector v= new Vector();
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);

        System.out.println(v.contains("Lucky"));
        v.remove("Lucky");
        System.out.println(v.contains("Lucky"));//false

    }
}
