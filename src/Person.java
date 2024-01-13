public class Person {
    String name;
    int age;
    String location;

    Person(){
        name = "Suhail";
        age = 26;
        location = "Bengalur";
        System.out.println(name);
        System.out.println(age);
        System.out.println(location);

    }
    Person(String name, int age, String location){
        this.age = age;
        this.name = name;
        this.location = location;
    }
    void PrintDetails(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.location);

    }
}
