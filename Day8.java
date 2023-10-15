package Day8;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gaji_bersih;
        
        System.out.print("Masukkan Gaji Pokok Anda : ");
        double gaji_pokok = input.nextDouble();
        
        System.out.print("Lama Lembur(dalam jam) : ");
        double perjam = 55000;
        double lama_lembur = input.nextDouble();
        
        System.out.print("Total Gaji : "+(gaji_bersih = gaji_pokok+(lama_lembur*perjam)));
        
    }
    
}
