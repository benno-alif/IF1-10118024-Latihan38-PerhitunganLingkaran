package com.benno;
import java.text.DecimalFormat;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menghitung jari-jari, luas, dan keliling lingkaran menggunakan konsep Object Oriented
     */

public class Main {

    public static void main(String[] args) {
        DecimalFormat satuan = new DecimalFormat();
	    Lingkaran obj = new Lingkaran();

        System.out.println("====Perhitungan Lingkaran====");
        obj.validasi();

        System.out.println("====Hasil Perhitungan Lingkaran====");

        System.out.println("Jari-jari Lingkaran = " + obj.hitungJari());
        System.out.println("Luas Lingkaran = " + satuan.format(obj.luasLingkaran()));
        System.out.println("Keliling Lingkaran = " + satuan.format(obj.kelLingkaran()));
    }
}
