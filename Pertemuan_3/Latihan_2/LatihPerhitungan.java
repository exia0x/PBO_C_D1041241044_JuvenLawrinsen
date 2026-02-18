/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk melakukan operasi aritmatika sederhana dan menampilkan perubahan nilai variabe
*/


public class LatihPerhitungan {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        int saldo = 1000000;
        System.out.println("Saldo Awal          : " + saldo);
        int setoran = 500000;
        saldo += setoran;
        System.out.println("Setoran             : " + setoran);
        System.out.println("Saldo Setelah Setor : " + saldo);
        int penarikan = 250000;
        saldo -= penarikan;
        System.out.println("Penarikan           : " + penarikan);
        System.out.println("Saldo Akhir         : " + saldo);
  }
}
