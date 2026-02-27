/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk menentukan jumlah hari dalam bulan tertentu.
*/


public class LatihanHariBulan {
    public static void main(String[] args) { 
        int month = 4, jumlahHari = 0;
        String namaBulan = ""; 
        switch (month){
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;                
        }

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahHari = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                jumlahHari = 30;
                break;
            case 2:
                jumlahHari = 28;
                break;
        }

        System.out.println("=== JUMLAH HARI DALAM BULAN ===");
        System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
        System.out.println("Jumlah hari: " + jumlahHari + " hari");
        
    }    
}
