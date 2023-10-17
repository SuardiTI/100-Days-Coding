package Day9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat Datang Di Database Suardi, Untuk Memastikan Ini Benar Kamu, Silahkan Masukkan Username Dan Password Serta Jawab Pertanyaan Verifikasi"+"\n");
        
        System.out.print("Username \t: ");
        String username = input.nextLine();
        
        System.out.print("Password \t: ");
        String password = input.nextLine();
        
        System.out.print("Masukkan Kode Akses Khusus : ");
        String kode = input.nextLine();
        
        System.out.print("Apa Nama Dari Folder Khusus Anda : ");
        int folder = input.nextInt();
        
        System.out.print("Huruf Depan Panggilan Anda : "+"\n");
        char nama = input.next().charAt(0);
        
        if(username.equals("SuardiDatabase") && password.equals("SuardiTI2023") && kode.equals("Teknik2023") && folder == 13579 && nama == 'A'){
            System.out.print("Login Berhasil, Sistem Telah Memverifikasi Bahwa Ini Benar Suardi");
        }
        else{
            System.out.print("Login Gagal, Sistem Tidak Dapat Memastikan Bahwa Ini Adalah Suardi");
        }
    }
    
}
