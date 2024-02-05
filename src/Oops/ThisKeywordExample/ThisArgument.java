package Oops.ThisKeywordExample;

public class ThisArgument {
    void show(ThisArgument td){

        System.out.println("Method is called");
    }
    void m2(){
        // this keyword can be used to pass as an argument in the method call
        show(this);
        System.out.println("This method will call show method");
    }
}
class ThisArgument2{
    public static void main(String[] args) {
        ThisArgument a = new ThisArgument();
        a.m2();
    }
}
