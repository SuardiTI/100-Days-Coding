package Day72;
import java.util.Scanner;
public class Main{
    
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat Yang Ingin Dicek               : ");
        String kalimat = x.nextLine();
        
        System.out.println("Masukkan SubString Yang Ingin Dicek             : ");
        String kata = x.nextLine();
        
        boolean cekKata = kalimat.contains(kata);
        
        System.out.println("Apakah Inputan Mengandung SubString Yang Dicari : " +cekKata);
        
    }
}
