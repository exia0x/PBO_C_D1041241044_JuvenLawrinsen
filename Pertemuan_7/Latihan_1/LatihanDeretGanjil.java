/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk menampilkan bilangan ganjil dari 1 sampai 15 menggunakan while loop.
*/

public class LatihanDeretGanjil {
    public static void main(String[] args) { 
        int angka = 1;
        
        System.out.println("=== BILANGAN GANJIL 1-15 ===");
        while(angka < 16){
            System.out.print(angka + " ");
            angka+=2;
        }
    }    
}
