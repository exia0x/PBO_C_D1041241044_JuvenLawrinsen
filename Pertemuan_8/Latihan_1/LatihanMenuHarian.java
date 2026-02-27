/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk  menampilkan menu makan untuk 3 hari, masing-masing dengan 2 waktu makan (pagi dan siang).
*/

public class LatihanMenuHarian {
    public static void main(String[] args) { 
        int itr = 1;
        System.out.println("=== MENU MAKAN 3 HARI ===");
        for (int i = 1; i <= 3; i++){
            System.out.println("Hari " + i + ":");
            for (int j = 0; j < 2; j++) {
                if (j % 2 == 0) {    
                    System.out.print("  Pagi: ");
                }
                else {    
                    System.out.print("  Siang: ");
                }
                switch(itr){
                    case 1: 
                        System.out.println("Nasi Goreng");
                        break;
                    case 2: 
                        System.out.println("Soto Ayam");
                        break;
                    case 3: 
                        System.out.println("Bubur Ayam");
                        break;
                    case 4: 
                        System.out.println("Mie Goreng");
                        break;
                    case 5: 
                        System.out.println("Roti Bakar");
                        break;
                    case 6: 
                        System.out.println("Nasi Uduk");
                        break;
                }
                itr++;
            }
        }
    }    
}
