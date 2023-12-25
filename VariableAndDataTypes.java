public class VariableAndDataTypes {
    public static void main(String[] args) {
        // Mendeklarasikan variabel bertipe integer dengan nama "umur" dan nilai awal 20
        int umur = 20;

        // Mendeklarasikan variabel bertipe string dengan nama "nama" dan nilai awal "John"
        String nama = "John";

        // Mendeklarasikan variabel bertipe boolean dengan nama "status" dan nilai awal true
        boolean status = true;

        System.out.println(umur);
        System.out.println(nama);
        System.out.println(status);

        // Tipe Data
         // Tipe data numerik (integer)
         int angka = 29;
         System.out.println("angka: " + angka);
 
         // Tipe data karakter (char)
         char karakter = 'A';
         System.out.println("karakter: " + karakter);
 
         // Tipe data boolean
         boolean benar = true;
         System.out.println("benar: " + benar);
 
         // Tipe data string
         String teks = "Halo, dunia!";
         System.out.println("teks: " + teks);
 
         // Tipe data array (array of integer)
         int[] bilangan = {1, 2, 3, 4, 9};
         for (int i = 0; i < bilangan.length; i++) {
            System.out.println("Array: " + bilangan[i]);
        }
    }    
}