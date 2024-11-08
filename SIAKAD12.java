import java.util.Scanner;

public class SIAKAD12 {
    public static void main(String[] args) {
        Scanner Input12 = new Scanner(System.in);

        double totalPerSiswa = 0, totalPerMatkul = 0;

        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input Nilai Mahasiswa Ke-" + (i + 1) + ": ");
                
                for (int j = 0; j < nilai[i].length; j++) {
                    System.out.print("Nilai Mata Kuliah " + (j + 1) + ": ");
                    nilai[i][j] = Input12.nextInt();
                    totalPerSiswa += nilai[i][j];
                }

                System.out.println("Nilai Rata-Rata: " + totalPerSiswa / 3);
            }

        System.out.println("\n=====================================");
        System.out.println("Rata-Rata Nilai Setiap Mata Kuliah: ");

        for (int j = 0; j < 3; j++) {
            totalPerMatkul = 0;

                for (int i = 0; i < 4; i++) {
                    totalPerMatkul += nilai[i][j];
                }

                System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / 4);

            }
        }
    }
