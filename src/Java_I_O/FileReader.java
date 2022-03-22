package Java_I_O;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        int readCharacter;
        FileInputStream fileInputStream = null;
        try {

            fileInputStream = new FileInputStream("Class.php");
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Could not open file, please check path and file name");

        }
        //now the file is open to be read
        try {
            do {
                readCharacter = fileInputStream.read();
                if (readCharacter != -1) {
                    System.out.println((char) readCharacter);
                }
            }
            while (readCharacter != -1);
        } catch (IOException ioException) {
            System.err.println("Error in reading file");
        } catch (NullPointerException nullPointerException) {
            System.err.println("The file input stream reference was null");
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException ioException) {
                System.err.println("Error in closing the file");
            }
        }

    }
}
