package Day97;
import java.util.Arrays;
import java.util.Scanner;
public class Belajar {
    public static void main (String[] args){
        Scanner x = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Nama : ");
        int jumlah = x.nextInt();
        x.nextLine();
        
        String[]nama = new String[jumlah];
        
        for(int i = 0; i < nama.length; i++){
            System.out.print("Masukkan Nama Ke-" + (i + 1) + " : ");
            nama[i] = x.nextLine();
        }
        Arrays.sort(nama);
        
        System.out.println("Array Setelah Diurutkan : ");
        for (String cetak : nama){
            System.out.println(cetak);
        }

    }
}
