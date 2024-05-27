package org.example;

import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    private static String[] args;

    public static void main(String[] args) {
        Main.args = args;
        String nama, jeniskelamin, tanggal;
        int tahun, bulan, tanggalq;
        int tahunq, bulanq;

        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Nama = ");
        nama = input.nextLine();
        System.out.print("Jenis kelamin (p/l) = ");
        jeniskelamin = input.nextLine();
        System.out.print("Tanggal lahir (yyyy-mm-dd) = ");
        tanggal = input.nextLine();


        String jenis;
        switch (jeniskelamin) {
            case "l":
                jenis = "Laki Laki";
                break;
            case "p":
                jenis = "Perempuan";
                break;
            default:
                jenis = "tidak diketahui";
                break;
        }

        String[] tanggalArr= tanggal.split("-");
        tahun = Integer.parseInt(tanggalArr[0]);
        bulan = Integer.parseInt(tanggalArr[1]);
        tanggalq = Integer.parseInt(tanggalArr[2]);

        LocalDate today = LocalDate.now();

        LocalDate tanggalLahir = LocalDate.of(tahun, bulan, tanggalq);

        Period selisih = Period.between(tanggalLahir, today);
        tahunq = selisih.getYears();
        bulanq = selisih.getMonths();

        System.out.println("Nama Anda = " + nama);
        System.out.println("Jenis Kelamin = " + jenis);
        System.out.println("Umur "+tahunq+" tahun "+ bulanq+ " bulan.");
    }
}