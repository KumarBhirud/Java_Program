package Ex_12_Abstraction;

public class ex_02_abstraction_interface {
    static void main(String[] args) {
        alto al=new alto();
        al.drive();
        al.
    }
}


abstract class car1{                    //
    abstract void startcar();
    abstract void stopcar();
}

class alto extends car1 implements tyre,gear{
        void drive(){
            this.startcar();
            changegear();
            rubbertyre();
            blackcolourtyre();
            this.stopcar();

        }

    @Override
    void startcar() {
        System.out.println("this is startcar");
    }

    @Override
    void stopcar() {
        System.out.println("this is stopcar");

    }

    @Override
    public void changegear() {
        System.out.println("this is change gear");

    }

    @Override
    public void rubbertyre() {
        System.out.println("this is rubber tyre ");
    }

    @Override
    public void blackcolourtyre() {
        System.out.println("this is colour tyre ");

    }
}

interface tyre{
    abstract void rubbertyre();
    void blackcolourtyre ();

}
interface gear {
    void changegear();

}