package Day80;
import java.util.Scanner;
public class Main{
    
    public static void main(String[]args){
        Scanner x = new Scanner (System.in);
        
        int maks = 3;
        int inputan = 0;
        
        while (inputan < maks){
            System.out.print("Masukkan PIN : ");
            int pin = x.nextInt();
            
            if(pin == 2324){
                System.out.println("Login Berhasil");
                break;
            }
            else{
                System.out.println("PIN Salah. Silahkan Coba Lagi");
                inputan++;
            }
        }
        if(inputan == maks){
            System.out.println("Anda Sudah Melakukan Kesalahan Sebanyak 3x, Kartu Diblokir");
        }
        
    }
}
