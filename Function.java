public class Function {

    // Deklarasi method integer
    static int tambah(int a, int b) {
        int hasil = a + b;
        return hasil;
    }

    // Deklarasi method String
    static String gabung(String a, String b) {
        String hasil = a + " " + b;
        return hasil;
    }


    public static void main(String[] args) {
        // Memanggil method int
        int hasilTambah = tambah(5, 3);
        System.out.println("Hasil penjumlahan 5 + 3 adalah " + hasilTambah);

        // Memanggil method str
        String hasilGabung = gabung("Halo", "dunia!");
        System.out.println(hasilGabung);
    }
}
