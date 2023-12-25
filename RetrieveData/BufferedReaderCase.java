package RetrieveData;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferedReaderCase {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Nama Anda : ");
        String name = input.readLine();
        System.out.println("Nama Anda : " + name);
    }
}
