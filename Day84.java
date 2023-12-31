package Day84;
import java.util.Scanner;
public class Main{
    
    public static void main(String[]args){
        
        Scanner x = new Scanner(System.in);
        
        int masuk = 0;
        int input = 3;
        
        System.out.print("Masukkan Password Anda	                : ");
        String pswd = x.nextLine();
        System.out.println("Password Berhasil Disimpan");
        
        while(masuk < input){
          System.out.print("Untuk Login Masukkan Kata Password Anda : ");
          String login = x.nextLine();
            if(login.equals(pswd)){
                System.out.println("Password Benar, Akses Diberikan");
                break;
            }
            else{
                System.out.println("Password Salah, Akses Ditolak");
                masuk++;
            }
        }
        if(masuk == input){
            System.out.println("Telah Melakukan 3x Kesalahan, Akses Diblokir");
        }
    }
}
