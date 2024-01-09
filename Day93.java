package Day93;
import java.util.Scanner;
public class Belajar {
    //class di dalam class
    public class Membaca{
        public int jumlah(int a, int b){
            return a + b;
        }
    }
    public static void main (String []args){
        Scanner x = new Scanner(System.in);
        
        Belajar objek1 = new Belajar();
        Belajar.Membaca objek2 = objek1. new Membaca();
        
        System.out.print("Masukkan angka pertama : ");
        int angka1 = x.nextInt();

        System.out.print("Masukkan angka kedua   : ");
        int angka2 = x.nextInt();

        int hasil = objek2.jumlah(angka1, angka2);
        
        System.out.println("Hasil                  : "+hasil);
    }

}
