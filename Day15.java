package Day15;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        //Ternary Operator Untuk Menentukan Angka Genap Dan Angka Ganjil
        Scanner n = new Scanner(System.in);
        System.out.println(">>>TERNARY OPERATOR<<<");
        System.out.print("Masukkan Angka : ");
        int angka = n.nextInt();
        
        String hasil = (angka % 2 == 0) ? "Angka Genap" : "Angka Ganjil";
        System.out.print("Angka "+angka+" Adalah "+hasil);
    }
    
}
