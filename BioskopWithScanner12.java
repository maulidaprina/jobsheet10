import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner Input12 = new Scanner(System.in);

        int baris, kolom, pilihan;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n======== DAFTAR MENU BIOSKOP ========");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu: ");
            pilihan = Input12.nextInt();
            Input12.nextLine(); 

            if (pilihan == 1) { 
                while (true) {
                    System.out.println("\n======== INPUT PENONTON BIOSKOP ========");
                    System.out.print("Masukkan Nama Penonton: ");
                    nama = Input12.nextLine();

                    while (true) {
                        System.out.print("Masukkan Baris (1-4): ");
                        baris = Input12.nextInt();
                        System.out.print("Masukkan Kolom (1-2): ");
                        kolom = Input12.nextInt();
                        Input12.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Baris/kolom tidak tersedia. Silakan coba lagi.");

                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");

                        } else {
                            break; 
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input Penonton Lainnya? (Y/N): ");
                    next = Input12.nextLine();

                    if (next.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            } else if (pilihan == 2) { 
                System.out.println("\n======== DAFTAR PENONTON BIOSKOP ========");

                    for (String[] barisArray : penonton) {
                        for (String kursi : barisArray) {
                            System.out.print((kursi == null ? "***" : kursi) + "\t");
                        }
                    System.out.println();
                }
            } else if (pilihan == 3) { 
                System.out.println("\nTerima kasih!");
                break;

            } else { 
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
