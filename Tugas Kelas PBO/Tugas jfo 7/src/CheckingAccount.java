import java.util.Scanner;

public class CheckingAccount {

    private double balance;
    private double nominal;
    private String name;
    Scanner inputUser = new Scanner(System.in);

    public CheckingAccount(){

    }
    public CheckingAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    //=====================SETTER================
    public void setName(String name){
        this.name   = name;
    }
    public void setBalance(double balance){
        this.balance   = balance;
    }


    //========================GETTER================
    public String getName(){
        return name;
    }
    public double getBalance(){

        return balance;
    }

    //================METHOD LAINNYA==========

    public void withdraw(){
        System.out.println("Masukkan jumlah uang:");
        nominal = inputUser.nextDouble();
        if(nominal <= balance ){
            balance = balance - nominal;
            System.out.println("Penarikan uang sebesar: Rp"+ nominal +" berhasil.");
            System.out.println("Sisa saldo: "+balance);


        }else{
            System.out.println("Saldo anda tidak cukup. ");

        }

    }

}