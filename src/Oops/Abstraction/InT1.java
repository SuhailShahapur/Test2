package Oops.Abstraction;

interface InT1
{
    //By default interface will have public access modifies and abstract method

    // We can also create concrete methods ex: static method, private method and default methods

    //   By default compiler will put public static final before fields
    public abstract void show(String a);
     void display();


}

class T2 implements InT1 {

    // here methods should be public or else it will throw an error
    public void show(String a) {
        System.out.println("test1");
    }

    @Override
    public void display() {
        System.out.println("display method");
    }

    public static void main(String[] args) {
        T2 a = new T2();
        a.show("q");
        a.display();

    }
}

