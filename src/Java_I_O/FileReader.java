package Java_I_O;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {
    public static void main(String[] args) {
        int readCharacter;
        FileInputStream fileInputStream = null;
        try {

            fileInputStream = new FileInputStream("Class.php");
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Could not open file, please check path and file name");

        }
    }
}
