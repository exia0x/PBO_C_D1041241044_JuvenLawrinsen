/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk mencari koordinat [2,3] dalam tabel 3×5 menggunakan nested loop, lalu hentikan pencarian dengan break.
*/

public class LatihanTotalGenap {
    public static void main(String[] args) { 
        boolean berhenti = false;
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 5; j ++){
                System.out.println("Cek: [" + i + ", " + j + "]");
                if (i == 2 && j == 3){
                    System.out.println("Koordinat ditemukan!");
                    System.out.println("Pencarian Selesai.");
                    berhenti = true;
                    break;
                }
            }
            if (berhenti) break;
        }
    }    
}
