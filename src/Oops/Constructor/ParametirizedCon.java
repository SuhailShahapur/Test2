package Oops.Constructor;

import java.util.regex.Pattern;

public class ParametirizedCon {
    String name;
    int age;

    ParametirizedCon(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ParametirizedCon a1 = new ParametirizedCon("suhail", 26);
        ParametirizedCon a2 = new ParametirizedCon("Naruto", 32);

        //Print employee details
        System.out.println(a1.name+"   "+a1.age);
        System.out.println(a2.name+"   "+a2.age);
    }
}
