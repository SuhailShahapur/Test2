package Oops.SuperExample;

public class Superm1 {
    void show(){
        System.out.println("i am in class 1");
    }
}
class Superm2 extends Superm1{
    void m1(){
        super.show();
        System.out.println("i am in class 2");
    }

    public static void main(String[] args) {
        Superm2 a = new Superm2();
        a.m1();
    }
}