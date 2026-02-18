/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk melatih penggunaan berbagai tipe data primitif dalam konteks informasi mahasiswa.
*/

public class LatihDataMahasiswa {
  public static void main(String[] args) {
    long NIM = 2301010001L;
    String nama = "Budi Santoso";
    char kelas = 'A';
    Boolean status = true;
    double IPK = 3.75;
    int sks = 72; 
    System.out.println("=== DATA MAHASISWA ===");
    System.out.println("NIM           : " + NIM);
    System.out.println("Nama          : " + nama);
    System.out.println("Kelas         : " + kelas);
    System.out.println("Status Aktif  : " + status);
    System.out.println("IPK Semester  : " + IPK);
    System.out.println("Total SKS     : " + sks);
  }
}