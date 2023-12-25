import java.util.ArrayList;
import java.util.List;

public class ArrayAndList {
     public static void main(String[] args) {
        // Membuat objek Array
        int[] array = {10, 20, 30, 40, 50};

        // Membuat objek ArrayList
        List<Integer> list = new ArrayList<>();

        // Menambahkan elemen ke dalam array
        for (int i = 0; i < 5; i++) {
            array[i] = i * 10;
        }

        // Menambahkan elemen ke dalam list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Mengganti elemen di indeks 0
        list.set(0, 100);

        // Menghapus elemen di indeks 1
        list.remove(1);

        // Menampilkan elemen dalam array dan list
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array: " + array[i]);
        }

        for (Integer integer : list) {
            System.out.println("List: " + integer);
        }
    }
}
