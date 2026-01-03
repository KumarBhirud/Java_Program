package Ex_17_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Collections;

public class Lab240_IQ {


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
        Collections.sort(al, Collections.reverseOrder());
        for (Integer o : al) {
            System.out.println(6 * o);
        }
    }
}
