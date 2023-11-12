package Day35;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int nomor;
        
        do{
            System.out.print("Masukkan 9 Untuk Keluar Dari Program : ");
            nomor = x.nextInt();
            System.out.println("Anda Memasukkan Angka : "+nomor);
            
        }while (nomor!=9);
        System.out.print("Program Selesai");
        
        
    }
    
}
