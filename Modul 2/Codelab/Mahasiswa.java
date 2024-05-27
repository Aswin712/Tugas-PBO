import java.util.Scanner;
public class Mahasiswa
{
    public static class DataMahasiswa
    {
        public String namaMahasiswa = null, nimMahasiswa = null, jurusanMahasiswa = null;
        Scanner simpanData = new Scanner(System.in);
        int pilihan = 0;

        public void menuPilihan()
        {
            do
            {
                System.out.println("\nMenu: ");
                System.out.println("1. Tambahkan Data Mahasiswa");
                System.out.println("2. Tampilkan Data Mahasiswa");
                System.out.println("3. Keluar\n");

                System.out.print("Pilihan Anda: ");
                pilihan = simpanData.nextInt();
                simpanData.nextLine();

                switch (pilihan)
                {
                    case 1:
                        System.out.print("Masukkan Nama Mahasiswa: ");
                        namaMahasiswa = simpanData.nextLine();
                        do
                        {
                            System.out.print("Masukkan NIM Mahasiswa: ");
                            nimMahasiswa = simpanData.nextLine();

                            if (String.valueOf(nimMahasiswa).length() != 15)
                            {
                                System.out.println("NIM Harus 15 Digit!");
                            }
                        }
                        while (String.valueOf(nimMahasiswa).length() != 15);

                        System.out.print("Masukkan Jurusan Mahasiswa: ");
                        jurusanMahasiswa = simpanData.nextLine();

                        System.out.println("Data Mahasiswa Berhasil Ditambahkan!");
                        break;
                    case 2:
                        if (namaMahasiswa == null || nimMahasiswa == null || jurusanMahasiswa == null)
                        {
                            System.out.println("Data Mahasiswa Belum Ditambahkan!");
                        }
                        else
                        {
                            System.out.println("Data Mahasiswa: ");
                            System.out.println("Nama Siswa: " + namaMahasiswa);
                            System.out.println("NIM Siswa: " + nimMahasiswa);
                            System.out.println("Fakultas Siswa: " + jurusanMahasiswa);
                        }
                        break;
                    case 3:
                        System.out.println("Selesai");
                        break;
                    default:
                        System.out.println("Pilihan Anda Tidak Valid!");
                        break;
                }
            }
            while (pilihan != 3);
        }
    }

    public static void main(String[] args) {
        Mahasiswa DataMahasiswa = new Mahasiswa();
        DataMahasiswa.menuPilihan();
    }

}