package Ex_17_Collection_Framework.CF_04_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab245_Map_P2 {
    static void main(String[] args) {

//        Map map = new HashMap();
        HashMap map = new HashMap();
        map.put("id",1);
        map.put("id",2);
        map.put("id2",100);
        map.put("id4",null);
        map.put(null,102);
        System.out.println(map);        //{null=102, id2=100, id4=null, id=2}

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));
        System.out.println(map.containsValue(102));


        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.get("id2"));

    }
}
