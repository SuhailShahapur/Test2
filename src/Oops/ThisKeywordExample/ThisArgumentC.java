package Oops.ThisKeywordExample;

public class ThisArgumentC {
    ThisArgumentC(A obj){
        System.out.println("Argument constructor");
    }
}
class A{
    void m1(){
        ThisArgumentC a = new ThisArgumentC(this);
    }

    public static void main(String[] args) {
        A td = new A();
        td.m1();
    }
}
