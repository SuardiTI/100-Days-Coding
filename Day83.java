package Day83;
import java.util.Scanner;
public class Main{
    
    public static void main(String[]args){
        //Reverse String
        Scanner x = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        String input = x.nextLine();
        
        String kebalikan = new StringBuilder(input).reverse().toString();
        
        System.out.println("Sebelum          : "+input);
        System.out.println("Sesudah          : "+kebalikan);
    }
}
