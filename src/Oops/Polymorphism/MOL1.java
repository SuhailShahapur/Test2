package Oops.Polymorphism;

public class MOL1 {
    //Method overloading with different arguments

    void show(){
        System.out.println("method 1");
    }
    void show(int a){
        System.out.println("method 2");
    }

    public static void main(String[] args) {
        MOL1 a = new MOL1();
        a.show();  //first method is called
        a.show(1);  //second method will be called
    }
}
