package at.ac.htlstp.sj21k4b;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadTest {

    public static void main(String[] args) throws IOException {

        File file = new File(FileWriteTest.FILENAME);
        FileReader fileReader = new FileReader(file);
        BufferedReader bfr = new BufferedReader(fileReader);
        String line;
        line = bfr.readLine();
        while ((line = bfr.readLine())!=null)
            System.out.println(line);
        bfr.close();
    }
}
