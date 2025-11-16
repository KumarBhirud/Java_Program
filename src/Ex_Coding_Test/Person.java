package Ex_Coding_Test;

public class Person {

    String Name;
    int age;

    Person (String Name,int Age){
        System.out.println("Name :" +Name);
        System.out.println("Age :" +Age);

    }
    static void main(String[] args) {
        Person p=new Person("John",25);
        Person p1=new Person("Alice",30);
    }
}

