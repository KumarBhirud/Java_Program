package Ex_14_Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab219_Throws {

    static void main(String[] args) throws FileNotFoundException {

        try {
            FileReader f = new FileReader (new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
