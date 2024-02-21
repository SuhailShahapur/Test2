package ExceptionPractise;

public class ExceptionPM {
    public static void main(String[] args) {
        try{
            int a=10, b=0, c;
            c = a/b;
        }
        catch (ArithmeticException e){
            //System.out.println(e);
            // this will print exception name and description an will not print line occurance details.
            //System.out.println(e.getMessage());
            // get message will only print description
            e.printStackTrace();
            // this method will print exception name, description, and line trace
        }
    }
}
