package Day62;
import java.util.Scanner;
public class Main {
    
    public static double HitungLuasSegitiga(double alas, double tinggi){
        return 0.5 * alas * tinggi;
    }
        
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Masukkan Alas Segitiga   : ");
        double alas = x.nextDouble();
        
        System.out.print("Masukkan Tinggi Segitiga : ");
        double tinggi = x.nextDouble();
        
        double luas = HitungLuasSegitiga(alas, tinggi);
        
        System.out.print("Luas Segitiga : "+luas);
    }
    
}
