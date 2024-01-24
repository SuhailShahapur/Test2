package Oops.ThisKeywordExample;

public class ThisConstructor {
    ThisConstructor(){
        System.out.println("No argument constructor");
    }
    ThisConstructor(int a){
        this();// it will call no argument constructor
        System.out.println("Parameterized constructor");
    }
}
class ThisConstructor2{
    public static void main(String[] args) {
        ThisConstructor a = new ThisConstructor(10);

    }
}
