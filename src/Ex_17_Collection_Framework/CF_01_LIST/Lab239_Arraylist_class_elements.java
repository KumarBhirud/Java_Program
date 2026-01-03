package Ex_17_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab239_Arraylist_class_elements {
    static void main() {


        students s1 = new students("Kumar", "11");
        students s2 = new students("akash", "12");
        students s3 = new students("navya", "13");

        List<students> myStudent = new ArrayList<>();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);

        s1.Print_details();
        s2.Print_details();
        s3.Print_details();
    }

}

class students{

   private String name;
   private String Roll_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public students(String roll_no, String name) {
        Roll_no = roll_no;
        this.name = name;
    }

    public void Print_details() {
        System.out.println("Student Name : " +this.name);
        System.out.println("Student Roll_no : " +this.Roll_no);
    }
}
