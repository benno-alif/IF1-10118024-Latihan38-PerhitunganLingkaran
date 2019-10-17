package com.benno;
import java.util.Scanner;

public class Lingkaran {
    Scanner scanner = new Scanner(System.in);
    private Double diameter, jariJari;
    private Double Phi = Math.PI;

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public void validasi() {
        String dmt;
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            dmt = scanner.nextLine();
            System.out.println((!dmt.matches("[0-9]*")) ? "Nilai Diameter Tidak Sesuai" : "");
        } while (!dmt.matches("[0-9]*"));
        diameter = Double.parseDouble(dmt);
    }

    public Double hitungJari(){
        return jariJari = diameter / 2;
    }

    public Double luasLingkaran(){
        return Phi * (jariJari * jariJari);
    }

    public Double kelLingkaran(){
        return diameter * Phi;
    }
}
