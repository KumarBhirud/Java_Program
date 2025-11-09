package Ex_10_12_Oct_Encapsulation;

public class ex01_Account {
    static void main(String[] args) {
        bank bb=new bank();
        bb.setAccno(8225);
        bb.setName("Kumar");
        bb.setAmount(200000);

        System.out.println(bb.getAccno());
        System.out.println(bb.getName());
        System.out.println(bb.getAmount());
    }

}

class bank{
   private int accno;
   private String name;
   private double amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }
}
