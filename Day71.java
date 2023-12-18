package Day71;
import java.util.Scanner;
public class Main{
    
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);
        
        System.out.print("Masukkan Kata  : ");
        String nama = x.nextLine();
        
        String hurufBesar = nama.toUpperCase();
        
        System.out.print("Hasil          : "+hurufBesar);
        
    }
        
}
