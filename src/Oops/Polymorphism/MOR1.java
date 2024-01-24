package Oops.Polymorphism;

public class MOR1 {
    void show(){
        System.out.println("class 1 method");
    }
}
class MOR2 extends MOR1 {
    void show(){
        System.out.println("Class 2 method");
    }

    public static void main(String[] args) {
        MOR2 a = new MOR2();
        MOR1 b = new MOR1();
        MOR1 c = new MOR2();
        a.show();
        b.show();
        c.show();

    }
}