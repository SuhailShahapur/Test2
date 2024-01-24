package Oops.Encapsulation;

//Encapsulation : it's a process of wrapping code and data together in a single unit
// data hiding can be achieved, other class will not be able to access the data through  the data members
public class En1 {

    // private data member
   private String Name;

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }
}
class En2{
    public static void main(String[] args) {
        En1 a = new En1();
        En1 a2 = new En1();

        a.setName("Suhail");
        System.out.println(a.getName());

        a2.setName("Naruto");
        System.out.println(a2.getName());
    }
}
