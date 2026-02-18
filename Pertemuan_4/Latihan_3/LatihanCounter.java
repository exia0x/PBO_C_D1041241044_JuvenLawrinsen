/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Mendemonstrasikan penggunaan increment, decrement, dan compound assignment.
*/


public class LatihanCounter {
    public static void main(String[] args) {
       int angka = 10;

       System.out.println("=== Counter ===");
       System.out.println("Nilai Awal: " + angka);
       angka++;
       angka++;
       System.out.println("Setelah ++ (2x): " + angka);
       angka--;
       System.out.println("Setelah --: " + angka);
       angka+=5;
       System.out.println("Setelah += 5: " + angka);
       angka-=3;
       System.out.println("Setelah -= 3: " + angka);
       angka*=2;
       System.out.println("Setelah *= 2: " + angka);
    }    
}
