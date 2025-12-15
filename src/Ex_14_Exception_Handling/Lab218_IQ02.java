package Ex_14_Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab218_IQ02 {

    static void main(String[] args) {

        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());        }

    }
}
