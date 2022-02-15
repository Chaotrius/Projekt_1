package at.ac.htlstp.sj21k4b;

import java.util.Scanner;

public class Widerstand {

    public static void main(String[] args) {

        double r1,r2,rp,rs;

        Scanner src = new Scanner(System.in);

        System.out.println("R1=");
        r1 = src.nextDouble();
        System.out.println("R2=");
        r2 = src.nextDouble();

        //Berechnung
        rp = r1*r2/(r1+r2);
        rs = r1+r2;
        System.out.printf("Parallel: %.2f Serie: %.2f\n",rp,rs);


    }

}
