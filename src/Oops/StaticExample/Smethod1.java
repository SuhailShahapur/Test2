package Oops.StaticExample;

public class Smethod1 {
    //static int a =5;
    static void display(){
        System.out.println("1");
        //System.out.println(a);// it can access only static variables
    }

    static class Sm2{
        public static void main(String[] args) {
            Smethod1.display();
        }


    }
}
