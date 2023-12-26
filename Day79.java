package Day79;
import java.util.Scanner;
public class Main{
    
    public static void main(String[]args){
        Scanner x = new Scanner (System.in);
        
        System.out.print("Masukkan Angka : ");
        int angka = x.nextInt();
        
        if(angka %3 == 0 && angka %5 == 0 ){
            System.out.println("Master Of Class");
        }
        else if(angka %3 == 0){
            System.out.println("Pride Of 3");
        }
        else if(angka %5 == 0){
            System.out.println("Pride Of 5");
        }
        
    }
}
