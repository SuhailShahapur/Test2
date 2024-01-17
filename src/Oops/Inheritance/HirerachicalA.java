package Oops.Inheritance;

public class HirerachicalA {
    void a (){
        System.out.println("A class Method");
    }
}
class HiraricahalB extends HirerachicalA{
    void b(){
        System.out.println("B class method");
    }
}
class Hirarichal_C extends HirerachicalA{
    void c(){
        System.out.println("C class Method");
    }

    public static void main(String[] args) {
        HirerachicalA ob1 = new HirerachicalA();
        HiraricahalB ob2 = new HiraricahalB();
        Hirarichal_C ob3 = new Hirarichal_C();
        ob2.a();
        ob2.b();
        System.out.println("________________________________");
        ob3.a();
        ob3.c();
    }
}