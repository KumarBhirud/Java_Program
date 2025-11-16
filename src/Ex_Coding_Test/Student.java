package Ex_Coding_Test;

public class Student {
    String name;
    int rollNo;
    char section;
    Student (String Name,int RollNo, char Section){
        this.name=Name;
        this.rollNo=RollNo;
        this.section=Section;

    }
     void  Display() {
         System.out.println("Student : " + name);
         System.out.println("Roll No : " + rollNo);
         System.out.println("Section : " + section);
     }

    static void main(String[] args) {
        Student s1=new Student("Bob",101,'A');
        s1.Display();
    }

}
