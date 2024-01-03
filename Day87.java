package Day87;
import java.util.Scanner;
public class Belajar {
    
    public static void main(String []args){
        Scanner x = new Scanner (System.in);
        double total = 0;
        
        System.out.print("Masukkan Jumlah Data Yang Akan Dihitung : ");
        int data = x.nextInt();
        
        for(int i = 1; i <=data; i++){
            System.out.print("Masukkan Nilai Ke-"+i+" : ");
            double nilai = x.nextDouble();
            total+=nilai;
        }
        double rataRata = total / data;
        
        System.out.print("Nilai Rata-Rata Adalah : "+rataRata);
    }
}
