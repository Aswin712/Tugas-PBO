public class Tokek {

    public String namaHewan = "Dika";
    public int umurHewan = 14;
    public String suaraHewan = "Tokkek-Tokkek";
    public char jenisKelamin = 'M';

    public void namaHewan()
    {
        System.out.println("Nama: " + namaHewan);
    }
    public void umurHewan()
    {
        System.out.println("Umur: " + umurHewan);
    }
    public void suaraHewan()
    {
        System.out.println("suara: " + suaraHewan);
    }
    public void jenisKelamin()
    {
        System.out.println("Jenis Kelamin: " + jenisKelamin);
    }

    public static void main(String [] args)
    {
        Tokek hewan = new Tokek();
        hewan.namaHewan();
        hewan.umurHewan();
        hewan.suaraHewan();
        hewan.jenisKelamin();
    }
}

