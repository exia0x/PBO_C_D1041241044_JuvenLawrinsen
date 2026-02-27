/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk menghitung total bilangan genap dari 1-20, lewati bilangan ganjil.
*/

public class LatihanTotalGenap {
    public static void main(String[] args) { 
        int total = 0;
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
        for (int i = 1; i <= 20; i++){
            if (i % 2 == 1) continue;
            total += i;
            System.out.println("Tambah: " + i + " -> Total: " + total);
        }
    }    
}
