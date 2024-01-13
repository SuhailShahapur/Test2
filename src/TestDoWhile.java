public class TestDoWhile {
    public static void main(String[] args){
        int i = 5;
        System.out.println("Before loop");
        do{
            System.out.println("inside loop");
            i++;
        }
        while(i<10);
            System.out.println("outside loop");
            System.out.println(i);


    }
}
