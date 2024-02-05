package Oops.SuperExample;

public class Superc1 {
    Superc1(){
        System.out.println("superc1 constructor is called");
    }
}
class Superc2 extends Superc1{
    Superc2(){
        //super(); // it will call parent class constructor
        System.out.println("constructor 2 is called");
    }

    public static void main(String[] args) {
        Superc2 a = new Superc2();
    }

}
