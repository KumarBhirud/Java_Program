package Ex_17_Collection_Framework.CF_01_LIST;

import java.util.Arrays;
import java.util.List;

public class LabConvertArrayToList {

    static void main() {
        String arr[]={"Java","Python","C#"};

        List <String> list= Arrays.asList(arr);
        System.out.println(list);
    }
}
