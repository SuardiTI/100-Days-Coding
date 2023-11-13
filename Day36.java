package Day36;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        
        int total_bayar = 0;
        int pilihan;
        System.out.println(">>>SELAMAT DATANG DI RESTORAN KAMI<<<");
     
        do{
            System.out.println("\nDaftar Menu :");
            System.out.println("1. Nasi Goreng - Rp12.000");
            System.out.println("2. Ayam Goreng - Rp15.000");
            System.out.println("3. Ayam Geprek - Rp13.000");
            System.out.println("4. Nasi Ayam   - Rp25.000");
            System.out.println("5. Selesai, Hitung Total Pembayaran");
            
            System.out.print("Silahkan Masukkan Pilihan (1-5) : ");
            pilihan = x.nextInt();
            
            if(pilihan == 1){
                total_bayar+=12000;
                }
            else if(pilihan == 2){
                total_bayar+=15000;
                }
            else if(pilihan == 3){
            total_bayar +=13000;
                }
            else if(pilihan == 4){
            total_bayar+=25000;
            }
            else if(pilihan == 5 ){
                System.out.println("Total Bayar : "+total_bayar);
            }
            else{
                System.out.println("Pilihan Tidak Valid");}
            
        }
        while(pilihan!=5);
        
        System.out.println("Terimakasih, Selamat Menikmati");
     
      
    }
    
}
        
