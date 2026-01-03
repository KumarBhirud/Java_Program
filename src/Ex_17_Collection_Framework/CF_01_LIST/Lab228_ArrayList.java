package Ex_17_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab228_ArrayList {
    static void main(String[] args) {


        List list=new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add(4);
        list.add(true);

        System.out.println(list.size());            //6
        System.out.println(list.isEmpty());           //false
        System.out.println(list.contains(1));           //false
        System.out.println(list.contains("1"));           //true
        System.out.println(list.contains(3));             //false
        System.out.println(list.contains("3"));          //true

        System.out.println(list);               //[1, 2, 3, 3, 4, true]

        System.out.println("-----");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----");
        for (Object o:list){
            System.out.println(o);
        }

        System.out.println("-----");
        Iterator iterator=List.of().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
