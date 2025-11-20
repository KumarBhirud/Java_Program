package Ex_Coding_Test;

public class Employee {

    private  int id;
    private  String name;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    static void main(String[] args) {
        Employee e1=new Employee();
        e1.setId(1);
        e1.setName("john Doe");
        e1.setSalary(50000);

        System.out.println("Employee Id : "+ e1.getId());
        System.out.println("Employee Name : "+ e1.getName());
        System.out.println("Employee Salary : "+ e1.getSalary());

    }
}
