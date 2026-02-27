/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program yang menghitung diskon berdasarkan total belanja.
*/


public class LatihanDiskon {
    public static void main(String[] args) { 
        double totalBelanja = 750000;
        double diskon = 0;
        if (totalBelanja < 100000) {
            diskon = 0;
        }
        else if (totalBelanja >= 100000 && totalBelanja < 500000) {
            diskon = 0.05;
        }
        else if (totalBelanja >= 500000 && totalBelanja < 1000000) {
            diskon = 0.10;
        }
        else {
            diskon = 0.15;
        }

        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);
        System.out.println("Diskon(" + ((int)diskon*100) + "): Rp " + totalBelanja*diskon);
        System.out.println("Harga Akhir: Rp " + (totalBelanja-(totalBelanja*diskon)));
        System.out.println("Anda Hemat: Rp " + (totalBelanja*diskon));

    }    
}
