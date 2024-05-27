import java.util.Scanner;

public class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(String name) {
        super(name);
    }

    @Override
    public void inputNilai() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input panjang: ");
            panjang = scanner.nextDouble();
            System.out.print("Input lebar: ");
            lebar = scanner.nextDouble();
            System.out.print("Input tinggi: ");
            tinggi = scanner.nextDouble();
        }
    }

    // Method untuk menghitung luas permukaan balok
    @Override
    public void luasPermukaan() {
        double hasil = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        super.luasPermukaan();
        System.out.println("Luas permukaan " + getName() + ": " + hasil);
    }

    // Method untuk menghitung volume balok
    @Override
    public void volume() {
        double hasil = panjang * lebar * tinggi;
        super.volume();
        System.out.println("Volume " + getName() + ": " + hasil);
    }
}
