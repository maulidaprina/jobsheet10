import java.util.Scanner;

public class Tugas_12 {
    public static void main(String[] args) {
        Scanner Input12 = new Scanner(System.in);

        double rata2Responden, rata2Pertanyaan, rata2Seluruh;
        int i, j, total, totalSeluruh = 0;

        int[][] hasilSurvei = new int[10][6];

        for (i = 0; i < hasilSurvei.length; i++) {
            System.out.println("\n============ Responden Ke-" + (i + 1) + " ============");
            System.out.println("Masukkan Hasil Survei (1-5) Untuk Setiap Pertanyaan!");

            for (j = 0; j < hasilSurvei[i].length; j++) {
                while (true) {
                    System.out.print("Pertanyaan Ke-" + (j + 1) + ": ");
                    int input = Input12.nextInt();
                    
                    if (input >= 1 && input <= 5) { 
                        hasilSurvei[i][j] = input;
                        break; 
                    } else {
                        System.out.println("Input tidak valid! Masukkan angka antara 1 hingga 5.");
                    }
                }
            }
            System.out.println();
        }

        System.out.println("=== Rata-Rata Untuk Setiap Responden ===");
        for (i = 0; i < 10; i++) {
            total = 0;
            for (j = 0; j < 6; j++) {
                total += hasilSurvei[i][j];
            }
            rata2Responden = (double) total / hasilSurvei[i].length;
            System.out.println("Responden " + (i + 1) + " : " + rata2Responden);
        }
        System.out.println();

        System.out.println("=== Rata-Rata Untuk Setiap Pertanyaan ===");
        for (j = 0; j < 6; j++) {
            total = 0;
            for (i = 0; i < 10; i++) {
                total += hasilSurvei[i][j];
            }
            rata2Pertanyaan = (double) total / hasilSurvei.length;
            System.out.println("Pertanyaan " + (j + 1) + " : " + rata2Pertanyaan);
        }
        System.out.println();

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 6; j++) {
                totalSeluruh += hasilSurvei[i][j];
            }
        }

        rata2Seluruh = (double) totalSeluruh / (hasilSurvei.length * hasilSurvei[0].length); 
        System.out.println("Rata-Rata Keseluruhan : " + rata2Seluruh);
    }
}
