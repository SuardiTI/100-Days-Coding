package Day10;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Mahasiswa : ");
        double nilai_anda = in.nextDouble();
        
        if(nilai_anda >=90 ){
            System.out.print("Nilai \t\t: A ");
        }
        else if(nilai_anda >=80 ){
            System.out.print("Nilai \t\t: B");
        }
        else if(nilai_anda >= 65 ){
            System.out.print("Nilai \t\t: C");
        }
        else if(nilai_anda >=45){
            System.out.print("Nilai \t\t: D");
        }
        else{
            System.out.print("Nilai \t\t: E");
        }
    }  
}
    
