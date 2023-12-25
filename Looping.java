public class Looping {
    public static void main(String[] args) {

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.print(i + ". ");
        }

        // while loop
        int y = 0;
        while (y < 5) {
            System.out.print(y + ". ");
            y++;
        }

        // do-while loop
        int x = 0;
        do {
            System.out.print(x + ". ");
            x++;
        } while (x < 5);
    }
}
