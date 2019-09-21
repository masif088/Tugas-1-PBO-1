package com.company;

import java.util.Scanner;

import static com.company.kelas.BubleSorting;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double a, b;
        System.out.println("Pilih bangun yang akan dihitung luasnya\n1.segitiga\n2.persegipanjang\n3.lingkaran");
        int pilih = sc.nextInt();
        switch (pilih){
            case 1:
                System.out.println("masukkan alas segitiga : ");
                a=sc.nextDouble();
                System.out.println("masukkan tinggi segitiga : ");
                b=sc.nextDouble();
                System.out.println("Luas segitiga anda = "+segitiga(a,b));
                break;
            case 2:
                System.out.println("masukkan panjang : ");
                a=sc.nextDouble();
                System.out.println("masukkan lebar : ");
                b=sc.nextDouble();
                System.out.println("Luas persegipanjang = "+persegipanjang(a,b));
                break;
            case 3:
                System.out.println("masukkan jari-jari : ");
                a=sc.nextDouble();
                System.out.println("Luas lingkaran = " + lingkaran(a));
                break;
            default:
                System.out.println("yang bener anjing");
        }

    }
    public static double segitiga(double alas, double tinggi){
        return alas*tinggi*0.5;
    }
    public static double persegipanjang(double p, double l){
        return p*l;
    }
    public static double lingkaran(double r){
        return Math.PI*r*r;
    }
}