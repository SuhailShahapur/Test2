package Oops.Inheritance;

public class IsARelationship {
    void eat(){
        System.out.println("Eating");
    }
}
class SubClass extends IsARelationship{
    public static void main(String[] args) {
        SubClass a1 = new SubClass();
        a1.eat();
    }
}
