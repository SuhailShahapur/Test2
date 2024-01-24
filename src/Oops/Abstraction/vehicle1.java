package Oops.Abstraction;

public abstract class vehicle1 {
    int No_of_Tyres;
    abstract void start();
}
class car extends vehicle1{
    @Override
    void start() {
        System.out.println("Starts with key ");
    }
}
class bike extends vehicle1{

    @Override
    void start() {
        System.out.println("Starts with kick");
    }

    public static void main(String[] args) {
        bike b = new bike();
        b.start();
        car c = new car();
        c.start();
    }

}
