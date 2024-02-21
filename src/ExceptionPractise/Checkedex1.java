package ExceptionPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checkedex1 {
    public static void main(String[] args) throws FileNotFoundException {
        //FileInputStream class helps to read the data from the file
        FileInputStream a = new FileInputStream("C:\\Installer.log");
    }
}
