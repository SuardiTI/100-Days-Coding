package Day14;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float nilai_rata_rata;
        float jumlah_matkul = 8f;
        
        System.out.print("Masukkan Nilai Dari Setiap Mata Pelajaran"+"\n\n");
        
        System.out.print("Fisika Elektronika                       : ");
        float fisika = in.nextFloat();
        
        System.out.print("Matematika Dasar                         : ");
        float matematika = in.nextFloat();
        
        System.out.print("Dasar-Dasar Pemprograman                 : ");
        float pemprograman = in.nextFloat();
        
        System.out.print("Pengantar Sistem Dan Teknologi Informasi : ");
        float pengantar = in.nextFloat();
        
        System.out.print("Bahasa Indonesia                         : ");
        float bahasa = in.nextFloat();
        
        System.out.print("Pendidikan Pancasila                     : ");
        float pancasila = in.nextFloat();
        
        System.out.print("Pendidikan Kewarganegaraan               : ");
        float pkn = in.nextFloat();
        
        System.out.print("Pendidikan Agama Kristen                 : ");
        float agama = in.nextFloat();
        
        System.out.print("Nilai Rata-Rata Anda                     : "+(nilai_rata_rata = (fisika + matematika + pemprograman + pengantar + bahasa + pancasila + pkn + agama) / jumlah_matkul));
        
    }
    
}
