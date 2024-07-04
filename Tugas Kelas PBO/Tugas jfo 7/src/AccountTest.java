import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        SavingsBond objSavingBond = new SavingsBond();
        CheckingAccount objCheckingAccount = new CheckingAccount("Aswin", 50000);
        //=========================== MENU ================================
        System.out.println("Nama    : " + objCheckingAccount.getName());
        System.out.println("Saldo   : Rp." + objCheckingAccount.getBalance());
        System.out.print("\n==== MENU ====\n1. Witdrawal \n2. Deposit\n> Pilih menu: ");
        int pilihan = inputUser.nextInt();
        switch (pilihan) {
            case 1:
                objCheckingAccount.withdraw();
                break;
            case 2:
                objSavingBond.viewDetailInfo(objCheckingAccount.getName(), objCheckingAccount.getBalance());
                break;
            default:
                 System.out.println("=== Invalid Input ===\n>>Pilih 1-2\n \n");
                 main(null);
        }
    }
}

