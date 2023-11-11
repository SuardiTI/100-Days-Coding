package Day34;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int jumlah = 0;
        
        System.out.print("Masukkan Batas Angka : ");
        int batas = x.nextInt();
        
        do{
            jumlah++;
            System.out.println("Jumlah Saat Ini : "+jumlah);
        }while(jumlah<batas);
        System.out.println("Program Berakhir. Jumlah Akhir : "+jumlah);
    }
    
}
