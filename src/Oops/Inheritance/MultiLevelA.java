package Oops.Inheritance;

public class MultiLevelA {
    void a(){
        System.out.println("A class method");
    }
}
class MultilevelB extends MultiLevelA{
    void b(){
        System.out.println("B class method");
    }
}
class MultilevelC extends MultilevelB{
    void c(){
        System.out.println("C Class Method");
    }

    public static void main(String[] args) {
        MultiLevelA ob1 = new MultiLevelA();
        MultilevelB ob2 = new MultilevelB();
        MultilevelC ob3 = new MultilevelC();

        ob1.a();
        System.out.println("------------------------");
        ob2.b();
        ob2.a();
        System.out.println("---------------------------");
        ob3.a();
        ob3.b();
        ob3.c();
    }
}
