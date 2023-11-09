package Day32;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Masukkan Angka Pertama  : ");
        int angka_awal = x.nextInt();
        
        System.out.print("Masukkan Angka Terakhir : ");
        int angka_akhir = x.nextInt();
        
        int penambahan = 0;
        String rentang_angka = "";
        
        for (int y=angka_awal; y<=angka_akhir; y++){
            /*penambahan +=y ini berfungsi untuk menjumlahkan setiap 
            angka berurut mulai dari angka pertama sampai angka terakhir*/
            penambahan += y;
            
            /*rentang_angka +=y ini berfungsi untuk menyimpan dan menampilkan 
            angka berurut mulai dari angka pertama sampai angka akhir*/
            rentang_angka += y;
            
            /*jika y < angka_akhir, maka rentang_angka += "+" ini akan 
            menambahkan simbol + di antara angka berurut dari awal sampai akhir*/
            if(y < angka_akhir){
                rentang_angka += " + ";
            }
        }
        //mencetak hasil
        System.out.println("Hasil : "+rentang_angka+" = " +penambahan);
    }
    
}
