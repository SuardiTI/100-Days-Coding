package Day82;
import java.util.Scanner;
public class Main{
    
    public static void main(String[]args){
        //Program pola bilangan meningkat dan bertingkat
        Scanner x = new Scanner(System.in);
        
        System.out.print("Masukkan Batas Angka : ");
        int angka = x.nextInt();
        x.nextLine();
        System.out.print("Angka Sama Tiap Baris ? (Ya/Tidak) : ");
        String pilihan = x.nextLine();
        
        if(pilihan.equalsIgnoreCase("Ya")){
            for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
                System.out.println();
            }
        }
        else if(pilihan.equalsIgnoreCase("Tidak")){
            for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
                System.out.println();
            }
        }
    }
}
