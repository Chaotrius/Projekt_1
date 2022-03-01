package at.ac.htlstp.sj21k4b;

import java.io.File;
import java.io.FileWriter;

public class FileWriteTest {
    public static void main(String[] args) {

        File file = new File("test.txt");
        FileWriter fileWriter = new FileWriter(file);

    }

}
