/*
NIM : D1041241044
NAMA : Juven Lawrinsen
Program untuk  memvalidasi username dan password.
*/


public class LatihanLogin {
    public static void main(String[] args) { 
        String username = "admin", password = "admin123";
        String inputUsername = "admin", inputPassword = "admin123";

        System.out.println("=== VALIDASI LOGIN ===");
        System.out.println("Username: " + inputUsername);
        System.out.println("Password: " + "****");
        System.out.println("---");

        if (inputUsername.equals(username)){
            System.out.println("Username Valid");
            if (inputPassword.equals(password)){
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, admin");
            }
            else{
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }
        }
        else{
            System.out.println("Username Tidak Valid");
        }
    }    
}
