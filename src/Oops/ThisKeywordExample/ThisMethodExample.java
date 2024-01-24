package Oops.ThisKeywordExample;

public class ThisMethodExample {
    void display1(){
        System.out.println("Method 1");
    }
    void display2(){
        this.display1();// this will be same as display(), if this keyword is not used than compiler will add it by default
        System.out.println("Method 2");
    }
}
class ThisMethodExample2{
    public static void main(String[] args) {
        ThisMethodExample a1 = new ThisMethodExample();
        a1.display2();

    }
}