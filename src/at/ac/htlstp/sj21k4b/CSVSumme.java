package at.ac.htlstp.sj21k4b;

import java.util.Arrays;
import java.util.Vector;

public class CSVSumme {
    public static final String CSVfile="datasrc/Mappe1.csv";

    public static void main(String[] args) {
        Datei.read(CSVfile);
        Vector<String> data = Datei.read(CSVfile);
        double sum=0;
        for(String line:data){
            String[] spalten = line.split(";");
            System.out.println(Arrays.toString(spalten));
            for (String sp:spalten) {
                try {
                    double w = Double.parseDouble(sp.replaceAll(",","."));
                } catch (Exception ex) {}
            }
        }
        System.out.println("Summe = "+sum);
    }
}
