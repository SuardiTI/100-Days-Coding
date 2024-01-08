package Day92;
import java.util.Scanner;
public class Belajar {
    //class di dalam class
    public class Membaca{
        public void cetak(String nama, String tgl, String alamat){
            System.out.println("Nama          : "+nama);
            System.out.println("Tanggal Lahir : "+tgl);
            System.out.println("Alamat        : "+alamat);
        }
    }
    public static void main (String []args){
        Scanner x = new Scanner(System.in);
        
        Belajar objek1 = new Belajar();
        Belajar.Membaca objek2 = objek1. new Membaca();
        
        System.out.print("Masukkan Nama          : ");
        String nama = x.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir : ");
        String tgl = x.nextLine();
        
        System.out.print("Masukkan Alamat        : ");
        String alamat = x.nextLine();
        
        objek2.cetak(nama, tgl, alamat);
    }

}
