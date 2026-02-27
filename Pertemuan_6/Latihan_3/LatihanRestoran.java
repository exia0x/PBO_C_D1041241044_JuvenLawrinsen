/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk menampilkan menu restoran dan harga.
*/

public class LatihanRestoran {
    public static void main(String[] args) { 
        int menuCode = 1;
        int quantity = 2;
        String namaMakanan = "";
        int hargaMakanan = 0;

        switch (menuCode){
            case 1:
                namaMakanan = "Nasi Goreng";
                hargaMakanan = 15000;
                break;
            case 2:
                namaMakanan = "Mie Ayam";
                hargaMakanan = 12000;
                break;
                
            case 3:
                namaMakanan = "Bakso";
                hargaMakanan = 10000;
                break;
            case 4:
                namaMakanan = "Soto Ayam";
                hargaMakanan = 13000;
                break;
            case 5:
                namaMakanan = "Es Teh";
                hargaMakanan = 3000;
                break;
        }
       

        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Kode Menu: " + quantity);

        System.out.println("\n");
        
        System.out.println("Pesanan Anda:");
        System.out.println("Nama Menu:" + namaMakanan);
        System.out.println("Harga Satuan: Rp " + hargaMakanan);
        System.out.println("Jumlah: " + quantity);
        System.out.println("---");
        System.out.println("Total Bayar: " + hargaMakanan*quantity);
        
    }    
}
