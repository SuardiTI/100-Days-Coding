package Day70;
import java.util.Scanner;
public class Main{
    
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);
        
        System.out.print("Masukkan Nama : ");
        String nama = x.nextLine();
        
        String hurufKecil = nama.toLowerCase();
        
        System.out.print("Nama          : "+hurufKecil);
        
    }
        
}
