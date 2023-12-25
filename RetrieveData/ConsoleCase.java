package RetrieveData;
import java.io.Console;

public class ConsoleCase {
    public static void main(String[] args) {
        Console data = System.console();
        System.out.print("Masukkan Nama Anda : ");
        String name = data.readLine();
        System.out.println("Nama Anda : " + name);
    }    
}
