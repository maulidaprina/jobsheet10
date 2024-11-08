import java.util.Scanner;

public class SIAKAD12 {
    public static void main(String[] args) {
        Scanner Input12 = new Scanner(System.in);

        int mahasiswa, matkul;
        double totalPerSiswa = 0, totalPerMatkul = 0;

        System.out.print("Masukkan Jumlah mahasiswa : ");
        mahasiswa = Input12.nextInt();
        System.out.print("Masukkan Jumlah mata kuliah : ");
        matkul = Input12.nextInt();
        Input12.nextLine();

        int[][] nilai = new int[mahasiswa][matkul];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = Input12.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            
            System.out.println("Nilai Rata-Rata Mahasiswa Ke-" + (i + 1) + ": " + totalPerSiswa/ matkul);
        }
        
        System.out.println("\n=====================================");
        System.out.println("Rata-Rata Nilai Setiap Mata Kuliah:");
        
        for (int j = 0; j < matkul; j++) {
            
            for (int i = 0; i < mahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / mahasiswa);
        }
        
    }
}