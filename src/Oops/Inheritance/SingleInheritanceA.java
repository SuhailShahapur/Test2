package Oops.Inheritance;

public class SingleInheritanceA {
    void a(){
        System.out.println("Parent class method");
    }
}
class SingleInheritanceB extends SingleInheritanceA{

    void b(){
        System.out.println("child class method");
    }
    public static void main(String[] args) {
        SingleInheritanceB ob1 = new SingleInheritanceB();
        ob1.b();
        ob1.a();

    }
}
