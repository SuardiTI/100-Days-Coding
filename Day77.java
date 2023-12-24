package Day77;
import java.util.Scanner;
public class Main{
    
    public static void main(String[]args){
        //String equalsIgnoreCase()
        Scanner x = new Scanner(System.in);
        
        System.out.print("Apakah Umur Anda Diatas 18 Tahun? (Ya/Tidak) : ");
        String pilihan = x.nextLine();
        
        if(pilihan.equalsIgnoreCase("Ya")){
            System.out.println("Sudah Memenuhi Syarat Minimum");
        }
        else if(pilihan.equalsIgnoreCase("Tidak")){
            System.out.println("Belum Memenuhi Syarat Minimum");
        }
        else{
            System.out.println("Masukan Tidak Valid!");
        }
    }
}
