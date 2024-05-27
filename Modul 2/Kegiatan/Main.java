package org.example;

import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

class Student {// Mewakili mahasiswa dengan nama, fakultas, program studi, dan tindakan seperti keluar dan melihat buku yang tersedia.
    static String Nama;
    static String Fakultas;
    static String programStudi;

    static void displayBooks(String[][] databuku){
        System.out.println("===========================================================================================");
        System.out.println("|| No.\t|| Id buku\t\t|| Nama Buku\t|| Author\t|| Category\t|| Stock ||");
        System.out.println("===========================================================================================");
        for (String[] buku : databuku) {
            System.out.println("|| "+buku[0]+"\t|| "+buku[1]+"\t|| "+buku[2]+"\t|| "+buku[3]+"\t|| "+buku[4]+"\t|| "+buku[5]+"\t ||");
        }
        System.out.println("===========================================================================================\n");
        System.out.println("Input Id buku yang ingin dipinjam (input 99 untuk kembali)");
    }
    static void logout(){
        System.out.println("System Logout...\n");
    }
}

class Admin {//Mewakili admin dengan fungsi untuk menambah mahasiswa dan menampilkan daftar mahasiswa.
    static String adminUsername = "admin";
    static String adminPassword = "admin";
    static String murid[][];

    static void displayStudents() {
        murid = Main.userStudent;
        System.out.println("List Of Registered Students: ");
        for (String[] students : murid) {
            System.out.println("Name\t: "+students[0]);
            System.out.println("Faculty\t: "+students[1]);
            System.out.println("NIM\t: "+students[2]);
            System.out.println("Program\t: "+students[3]+"\n");
        }
    }

    static void addStudent() {
        String data[] = new String[4];
        murid = Main.userStudent;
        Scanner scans = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        data[0] = scans.nextLine();
        System.out.print("Masukkan ProgramStudi mahasiswa: ");
        data[3] = scans.nextLine();
        System.out.print("Masukkan Fakultas mahasiswa: ");
        data[1] = scans.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        data[2] = scans.nextLine();
        while(true){
            if (String.valueOf(data[2]).length() != 15 ) {
                System.out.print(String.valueOf(data[1]).length());
                System.out.print("Nim Harus 15 Digit!!!\n");
                System.out.print("Masukkan NIM mahasiswa: ");
                data[2] = scans.nextLine();
            }else{
                break;
            }
        }

        Main.userStudent = Arrays.copyOf(murid, murid.length+1);
        Main.userStudent[murid.length] = data;
        System.out.println();
    }
}

class Main {
    static String[][] bookList = {
            {"1","388c-e681-9152","title","author","Sejarah","4"},
            {"2","ed90-be30-5cdb","title","author","Sejarah","0"},
            {"3","d95e-0c4a-9523","title","author","Sejarah","2"},
    };
    static String[][] userStudent ={
            {"Aswin Sulistyo", "Teknik","202310370311012","Informatika"},
    };

    static void menu(){//menampilkan pilihan
        System.out.println("===== Library System =====");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose Option(1-3): ");
        Scanner scan = new Scanner(System.in);
        int pilih = scan.nextInt();

        if(pilih == 1){
            inputNim();
        }else if(pilih == 2){
            log_admin();
        }else{
            System.out.println("Terima Kasih");
            System.exit(0);
        }
    }

    static void menuAdmin(){//menyediakan pilihan
        while(true){
            System.out.println("=== Admin Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display Registered Students");
            System.out.println("3. Logout");
            System.out.print("Choose Option(1-3): ");
            Scanner scan = new Scanner(System.in);
            int pilih = scan.nextInt();

            if(pilih == 1){
                Admin.addStudent();
            }else if(pilih == 2){
                Admin.displayStudents();
            }else if(pilih == 3){
                break;
            }
        }
    }

    static void menuStudent(){//menyediakan pilihan
        while(true){
            System.out.println("=== Student Menu ===");
            System.out.println("1. Buku terpinjam");
            System.out.println("2. Pinjam buku");
            System.out.println("3. Pinjam buku atau Logout");
            System.out.print("Choose Option(1-3): ");
            Scanner scan = new Scanner(System.in);
            int pilih = scan.nextInt();

            if(pilih == 1){
                //
            }else if(pilih == 2){
                Student.displayBooks(bookList);
            }else if(pilih == 3){
                Student.logout();
                break;
            }else if(pilih == 99){
                break;
            }
        }
    }

    static void checkNim(String data){
        for (int i = 0 ; i<userStudent.length ; i++ ) {
            if (data.equals(userStudent[i][2])) {
                menuStudent();
            }
        }
    }

    static void inputNim(){

        System.out.print("Enter your NIM : ");
        Scanner scan = new Scanner(System.in);
        String nim = scan.nextLine();

        while(true){
            if (nim.length() != 15 ) {
                System.out.print("Nim Harus 15 Digit!!!\n");
                System.out.print("Masukkan NIM mahasiswa: ");
                nim = scan.nextLine();
            }else{
                Main cn = new Main();
                cn.checkNim(nim);
                break;
            }
        }
    }

    static void log_admin(){

        System.out.print("Masukan username admin(admin) : ");
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        System.out.print("Masukan pasword admin(admln) : ");
        String pwd = scan.nextLine();

        if (user.equals(Admin.adminUsername)&&pwd.equals(Admin.adminPassword)) {
            System.out.println();
            Main.menuAdmin();
        }else{
            System.out.println("Invalid credentials for admin.\n");
        }
    }

    public static void main(String[] args) {
        while(true){
            Main.menu();
        }
    }

}