import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static class studentvariabel {


        public static int inputstudent;
        public static String exitInputbuku = " ";

        public static String inputslrhbuku;

        public static String tenggat;

        public static void Student() {
            Scanner input = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("===student menu===");
            System.out.println("1. buku yang dipinjam");
            System.out.println("2. pinjam buku");
            System.out.println("3. kembalikan buku");
            System.out.println("4. pinjam semua buku");
            System.out.print("pilih 1 - 4 = ");
            inputstudent = input.nextInt();

            switch (inputstudent) {

                case 1 :
                    if (exitInputbuku.equals("388c-e681-9152")) {
                        System.out.println("=================================================================================");
                        System.out.println("|| No. ||   Id Buku   ||   Nama Buku   ||   Author   ||   Category   ||   Durasi   ||");
                        System.out.println("=================================================================================");
                        System.out.println("||  1  || 388c-e681-9152 ||   title    ||   author    ||   sejarah   ||    null   ||");
                        System.out.println("=================================================================================");
                        System.out.println("Buku Terpinjam");
                        break;
                    }
                    if (exitInputbuku.equals("ed90-be30-5cdb")) {
                        System.out.println("Stok buku kosong");
                        break;
                    }
                    if (exitInputbuku.equals("d95e-0c4a-9523")) {
                        System.out.println("=================================================================================");
                        System.out.println("|| No. ||   Id Buku   ||   Nama Buku   ||   Author   ||   Category   ||   Durasi   ||");
                        System.out.println("=================================================================================");
                        System.out.println("||  3  || d95e-0c4a-9523  ||   title    ||   author    ||   novel   ||    null    ||");
                        System.out.println("=================================================================================");
                        System.out.println("Buku terpinjam");
                        break;
                    }
                    if (inputslrhbuku.equals("Y")){
                        System.out.println("=================================================================================");
                        System.out.println("|| No. ||   Id Buku   ||   Nama Buku   ||   Author   ||   Category   ||   Durasi   ||");
                        System.out.println("=================================================================================");
                        System.out.println("||  1  || 388c-e681-9152 ||   title    ||   author    ||   Sejarah   || "+tenggat+       "||");
                        System.out.println("||  2  ||                       stok kosong                          || "+tenggat+       "||");
                        System.out.println("||  3  || d95e-0c4a-9523 ||   title    ||   author    ||   Novel     || "+tenggat+       "||");
                        System.out.println("=================================================================================");
                        System.out.println("Seluruh buku terpinjam ");
                        break;
                    }
                    else{
                        System.out.println("\n\n");
                        System.out.println("Buku belum di pilih Silahkan pilih buku ! \n\n");

                    }

                case 2:
                    System.out.println("=================================================================================");
                    System.out.println("|| No. ||   Id Buku   ||   Nama Buku   ||   Author   ||   Category   ||   Stock   ||");
                    System.out.println("=================================================================================");
                    System.out.println("||  1  || 388c-e681-9152 ||   title    ||   author    ||   Sejarah   ||    4     ||");
                    System.out.println("||  2  || ed90-be30-5cdb ||   title    ||   author    ||   Cerita    ||    0     ||");
                    System.out.println("||  3  || d95e-0c4a-9523 ||   title    ||   author    ||   Novel     ||    2     ||");
                    System.out.println("=================================================================================");
                    System.out.println("klik 99 jika ingin keluar");
                    System.out.print("input = ");
                    exitInputbuku = input.next();
                    if (exitInputbuku.equals("99")) {
                        System.out.println("keluar ");
                        break;

                    } if (exitInputbuku.equals("388c-e681-9152")) {
                    System.out.println("=================================================================================");
                    System.out.println("|| No. ||   Id Buku   ||   Nama Buku   ||   Author   ||   Category   ||   Durasi   ||");
                    System.out.println("=================================================================================");
                    System.out.println("||  1  || 388c-e681-9152 ||   title    ||   author    ||   sejarah   ||    null   ||");
                    System.out.println("=================================================================================");
                    System.out.println("buku terpinjam");
                    break;
                }

                    if (exitInputbuku.equals("ed90-be30-5cdb")) {
                        System.out.println("Stok buku kosong");
                        System.out.println("silahkan pilih yang lain ");
                    }

                    if (exitInputbuku.equals("d95e-0c4a-9523")){
                        System.out.println("=================================================================================");
                        System.out.println("|| No. ||   Id Buku   ||   Nama Buku   ||   Author   ||   Category   ||   Durasi   ||");
                        System.out.println("=================================================================================");
                        System.out.println("||  3  || d95e-0c4a-9523  ||   title    ||   author    ||   novel   ||    null    ||");
                        System.out.println("=================================================================================");
                        System.out.println("buku terpinjam");
                        break;
                    }
                    break;

                case 3 :
                    System.out.println("terima kasih");
                    break;


                case 4:
                    System.out.println("=================================================================================");
                    System.out.println("|| No. ||   Id Buku   ||   Nama Buku   ||   Author   ||   Category   ||   Stock   ||");
                    System.out.println("=================================================================================");
                    System.out.println("||  1  || 388c-e681-9152 ||   title    ||   author    ||   Sejarah   ||    4     ||");
                    System.out.println("||  2  || ed90-be30-5cdb ||   title    ||   author    ||   Cerita    ||    0     ||");
                    System.out.println("||  3  || d95e-0c4a-9523 ||   title    ||   author    ||   Novel     ||    2     ||");
                    System.out.println("=================================================================================");
                    System.out.println(" ");
                    System.out.print(" anda yakin ingin meminjam semua buku ?  (Y/T) = ");
                    inputslrhbuku = input.next();
                    System.out.print("berapa lama anda meminjam = (maks 14 hari ) = ");
                    tenggat = input.next();
                    if (inputslrhbuku.equals("Y")) {
                        System.out.println("peminjaman berhasil");
                    }
                    if (inputslrhbuku.equals("T")){
                        System.out.println("terima kasih telah berkunjung");
                    }

                default:
            }
        }
    }

    public static class AddStudentVariabel {
        static  Scanner input = new Scanner(System.in);
        public static ArrayList<String> addstudentList = new ArrayList<>();
        public static ArrayList<String> addnimList = new ArrayList<>();
        public static ArrayList<String> jurusanList = new ArrayList<>();


        public static void TambahStudent(){
            System.out.print("Masukkan Nama Mahasiswa: ");
            String addstudent = input.next();

            String addnim;
            do {
                System.out.print("Masukkan NIM Mahasiswa (15 digit): ");
                addnim = input.next();
                if (addnim.length() != 15) {
                    System.out.println("NIM Harus 15 Digit!");
                }
            } while (addnim.length() != 15);

            input.nextLine();

            System.out.print("Masukkan Jurusan Mahasiswa: ");
            String jurusan = input.nextLine();

            addstudentList.add(addstudent);
            addnimList.add(addnim);
            jurusanList.add(jurusan); 

            System.out.println("Data Mahasiswa Berhasil Ditambahkan!");
        }

        public static void LihatStudent(){
            if (addstudentList.isEmpty()) {
                System.out.println("Data Mahasiswa Belum Ditambahkan!");
            } else {
                System.out.println("=================================");
                System.out.println("Data Mahasiswa: ");
                for (int i = 0; i < addstudentList.size(); i++) {
                    System.out.println("Nama Siswa: " + addstudentList.get(i));
                    System.out.println("NIM Siswa: " + addnimList.get(i));
                    System.out.println("Fakultas Siswa: " + jurusanList.get(i));
                    System.out.println("=================================");
                }
            }
        }
    }
    public static class bookvvariabel{
        static Scanner input = new Scanner(System.in);

        public static int  stock;
        public static String title, inauthor, iDbook, kategori= " ";


        public static void BookAddmin (){
            System.out.println("select book category");
            System.out.println("1. story");
            System.out.println("2. history");
            System.out.println("3. text ");
            System.out.print("ketik kategori =  ");
            kategori=input.next();
            if(kategori.equals("Story")) {
                System.out.println("Story");
            }
            if(kategori.equals("sejarah")) {
                System.out.println("Sejarah");
            }
            if(kategori.equals("text")){
                System.out.println("text");
            }
            else{
                System.out.println("input salah ");
            }
            System.out.println("input salah ");
            System.out.print("enter id book = ");
            iDbook= input.next();
            System.out.print("enter title = ");
            title=input.next();
            System.out.print("enter author = ");
            inauthor=input.next();
            System.out.print("enter the stock = ");
            stock = input.nextInt();
            System.out.println(" buku berhasil di tambah ");

        }


        public static void BookDisplay(){
            System.out.println("buku ditambahkan");
            System.out.println(" ");
            System.out.println("=================================================================================");
            System.out.println("|| No. ||   Id Buku   ||   Nama Buku   ||   Author   ||   Category   ||   Stock   ||");
            System.out.println("=================================================================================");
            System.out.println("||  1  || 388c-e681-9152 ||   title    ||   author    ||   Sejarah   ||    4     ||");
            System.out.println("||  2  || ed90-be30-5cdb ||   title    ||   author    ||   Cerita    ||    0     ||");
            System.out.println("||  3  || d95e-0c4a-9523 ||   title    ||   author    ||   Novel     ||    2     ||");
            System.out.println("||  4  || "  +iDbook+  " || "+title+"  ||"     +      inauthor     +    " ||"    +    kategori   +   " ||"   +   stock    +    " ||");
            System.out.println("=================================================================================");
        }
    }

    public static class adminvariabel {
        public static void Admin() {
            Scanner input = new Scanner(System.in);

            System.out.println("===admin menu===");
            System.out.println("1. add student");
            System.out.println("2. add book");
            System.out.println("3. display student ");
            System.out.println("4. display book");
            System.out.println("5. exit ");
            System.out.print("pilih 1 - 3 = ");
            int inputAdmin = input.nextInt();
            switch (inputAdmin) {
                case 1:
                    AddStudentVariabel.TambahStudent();
                    break;

                case 2:
                    bookvvariabel.BookAddmin();
                    break;

                case 3:
                    AddStudentVariabel.LihatStudent();
                    break;
                case 4:
                    bookvvariabel.BookDisplay();
                    break;

                case 5:
                    System.out.println("keluar ");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" ");
            System.out.println("===library sistem===");
            System.out.println("1. login as student");
            System.out.println("2. login as admin");
            System.out.println("3. exit");
            System.out.print("pilih 1-3 = ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:

                    System.out.print("Enter your Nim= ");
                    String inputnim = scanner.next();

                    if (inputnim.equals("123456789012345")) {
                        System.out.println("Successful login as student");
                    } else {
                        System.out.println("User not found");
                        break;
                    }
                    studentvariabel.Student();
                    break;

                case 2:
                    System.out.print("enter username (admin) = ");
                    String inputuser = scanner.next();
                    System.out.print("enter password (admin) = ");
                    String inputpassword = scanner.next();
                    if (inputuser.equals("admin")) {
                        if(inputpassword.equals("admin")){
                            System.out.println(" login berhasil ");
                        }
                    } else {
                        System.out.println("User not found");
                        break;
                    }
                    adminvariabel.Admin();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih angka 1-5.");
            }
        }
    }
}