/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk mensimulasikan validasi input nilai ujian (0-100) menggunakan do-while loop.
*/
import java.util.Scanner; 

public class LatihanValidasi {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        int nilai = 0;
        
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        do{
            nilai = input.nextInt();
            System.out.println("Percobaan Input: " + nilai);
            if (nilai < 0 || nilai > 100){
                System.out.println("Error: Nilai harus antara 0-100!");
            }
        } while (nilai < 0 || nilai > 100);
        System.out.println("Nilai valid: " + nilai);
    }    
}
