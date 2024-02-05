package Oops.SuperExample;

public class Suse1 {
    int a =10;

}
// super keyword can be used to refer immediate parent class instance variable.
// Should have a inheritance relation between the classes to use super keyword

class Suse2 extends Suse1{
    int a =20;
    void m1(int a){
        System.out.println(a); //5
        System.out.println(this.a);  //20
        System.out.println(super.a); //10
    }

    public static void main(String[] args) {
        Suse2 obj = new Suse2();
        obj.m1(5);
    }
}
