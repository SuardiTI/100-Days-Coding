package Day94;
import java.util.Scanner;
public class Belajar {
    //class di dalam class
    public class Membaca{
        public double gaji (double gajiPokok, double lembur){
            double bonus = lembur * 55000;
            return gajiPokok + bonus;
        }
    }
    public static void main (String []args){
        Scanner x = new Scanner(System.in);
        
        Belajar objek1 = new Belajar();
        Belajar.Membaca objek2 = objek1. new Membaca();
        
        System.out.print("Masukkan Gaji Pokok   : ");
        double gajiPokok = x.nextDouble();

        System.out.print("Masukkan Lama Lembur  : ");
        double lembur = x.nextDouble();

        double gajiBersih = objek2.gaji(gajiPokok, lembur);
        
        System.out.println("Hasil                 : "+gajiBersih);
    }

}
