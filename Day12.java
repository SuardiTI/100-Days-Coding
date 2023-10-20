package Day12;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nilai_akhir;
        
        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = in.nextLine();
        
        //Dosen 1
        System.out.print("\n"+"Dosen 1 - Masukkan Nilai Kehadiran : ");
        double kehadiran1 = in.nextDouble();
        
        System.out.print("Dosen 1 - Masukkan Nilai Tugas : ");
        double tugas1 = in.nextDouble();
        
        System.out.print("Dosen 1 - Masukkan Nilai Ujian Tengah : ");
        double ujian_tengah = in.nextDouble();
        
        //Dosen 2
        System.out.print("\n\n"+"Dosen 2 - Masukkan Nilai Kehadiran : ");
        double kehadiran2 = in.nextDouble();
        
        System.out.print("Dosen 2 - Masukkan Nilai Tugas : ");
        double tugas2 = in.nextDouble();
        
        System.out.print("Dosen 2 - Masukkan Nilai Ujian Akhir : ");
        double ujian_akhir = in.nextDouble();
        
        //Menghitung Rekap Nilai Kedua Dosen
        
        //Dosen 1 (Kehadiran 15%, Tugas 20%, Ujian Tengah 15%
        double nilai_dosen1 = (kehadiran1 *0.15)+(tugas1 * 0.2)+(ujian_tengah * 0.15);
            
        //Dosen 2 (Kehadiran 20%, Tugas 15%, Ujian Tengah 15%
        double nilai_dosen2 = (kehadiran2*0.2)+(tugas2*0.15)+(ujian_akhir*0.15);
        
            
        System.out.print("\n\n"+"Rekap Nilai Untuk Mahasiswa "+nama+"\n");
            
        //Print Hasil Nilai Kedua Dosen   
        System.out.print("Nilai Dosen 1 : "+nilai_dosen1+"\n");
            
        System.out.print("Nilai Dosen 2 :  "+nilai_dosen2+"\n");
            
        //Print Nilai Akhir    
        System.out.print("Nilai Akhir : "+(nilai_akhir = (nilai_dosen1+nilai_dosen2))+"\n");    
        
        //Memberikan Nilai Huruf
        if(nilai_akhir >=90.0 ){
            System.out.print("Nilai \t\t: A ");
        }
        else if(nilai_akhir >=80.0 ){
            System.out.print("Nilai \t\t: B");
        }
        else if(nilai_akhir >= 65.0 ){
            System.out.print("Nilai \t\t: C");
        }
        else if(nilai_akhir >=45.0){
            System.out.print("Nilai \t\t: D");
        }
        else{
            System.out.print("Nilai \t\t: E");
        }
        
    }
    
}
