package Oops.StaticExample;

public class Svariables1 {
    String EmpName;
    String id;
    static String company="AgilePoint";
    Svariables1(String EmpName, String id){
        this.EmpName=EmpName;
        this.id=id;
    }
    void display(){
        System.out.println(EmpName+"  "+id+"  "+company);
    }
}
class sv{
    public static void main(String[] args) {
        Svariables1  e1=new Svariables1("suhail","AP001");
        Svariables1  e2=new Svariables1("naruto","AP002");
        Svariables1  e3=new Svariables1("sasuke","AP003");
        e1.display();
        e2.display();
        e3.display();
    }
}
