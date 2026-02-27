/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk  menyimpan dan menampilkan informasi produk
*/


public class LatihanBilangan {
    public static void main(String[] args) { 
        int bilangan = -7;
        String jenis;
        String tipe = (bilangan % 2 == 0) ? "Genap" : "Ganjil";

        if (bilangan > 0){
            jenis = "positif";
        } 
        else if (bilangan < 0){
            jenis = "negatif";
        } 
        else{
            jenis = "Nol";
        } 

        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan    : " + bilangan);
        System.out.println("Jenis       : Bilangan " + jenis);
        System.out.println("Tipe        : " + tipe);
    }    
}
