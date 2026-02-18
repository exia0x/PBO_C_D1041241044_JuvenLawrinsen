/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk  menyimpan dan menampilkan informasi produk
*/


public class LatihanProduk {
    public static void main(String[] args) {
        String nama = "Laptop Asus"; 
        int hargaSatuan = 7000000;
        int jumlahStok = 15;
        boolean status = true;
        float pajak = 0.11f; 
        int total = jumlahStok*hargaSatuan;

        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk         : " + nama);
        System.out.println("Harga Satuan        : Rp " + hargaSatuan);
        System.out.println("Jumlah Stok         : " + jumlahStok);
        System.out.println("Status Tersedia     : " + status);
        System.out.println("---");
        System.out.println("Total Nilai Stok    : Rp " + total);
        System.out.println("Pajak (11%)         : Rp " + (int) (pajak*total));
    }    
}
