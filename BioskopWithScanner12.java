import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner Input12 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) { 
            System.out.print("Masukkan nama penonton: ");
            nama = Input12.nextLine();
                System.out.print("Masukkan baris: ");
                baris = Input12.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = Input12.nextInt();
                        Input12.nextLine();

                penonton[baris-1][kolom-1] = nama;

                System.out.print("Input Penonton Lainnya? (Y/N): ");
                next = Input12.nextLine();

            if (next.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}
