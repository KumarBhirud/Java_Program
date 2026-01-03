package Ex_17_Collection_Framework.CF_02_SET;

import java.util.*;

public class Lab240_SET {
    static void main(String[] args) {
        Set hs= new HashSet();

        hs.add("Kumar");
        hs.add("Bhirud");
        hs.add("kumar");

        System.out.println(hs.contains("Kumar"));

        System.out.println(hs.size());      //3
        System.out.println(hs);

        Set lhs=new LinkedHashSet();
        Set ts=new TreeSet();

    }
}
