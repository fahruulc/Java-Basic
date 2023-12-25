package RetrieveData;
import java.util.Scanner;

public class ScannerCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String name = input.nextLine();
        System.out.println("Nama Anda : " + name);
    }    
}
