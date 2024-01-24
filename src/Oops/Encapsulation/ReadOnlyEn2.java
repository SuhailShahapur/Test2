package Oops.Encapsulation;

public class ReadOnlyEn2 {
    private String Name ="Suhail";
    public String getName(){
        return Name;

    }
}
class EnS1{
    public static void main(String[] args) {
        ReadOnlyEn2 a = new ReadOnlyEn2();
        System.out.println(a.getName());

    }
}