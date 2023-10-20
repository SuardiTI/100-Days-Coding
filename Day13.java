package Day13;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Angka Pertama : ");
        double angka1 = in.nextDouble();
        
        System.out.print("Masukkan Operator      : ");
        char operator = in.next().charAt(0);
        
        System.out.print("Masukkan Angka Kedua   : ");
        double angka2 = in.nextDouble();
        
        if(operator == '+'){
            System.out.print("Hasil                  : "+(angka1 + angka2));
        }
        else if(operator == '-'){
            System.out.print("Hasil                  : "+(angka1 - angka2));
        }
        else if(operator == '*'){
            System.out.print("Hasil                  : "+(angka1 * angka2));
        }
        else if(operator == '/'){
            System.out.print("Hasil                  : "+(angka1 / angka2));
        }
        else if(operator == '%'){
            System.out.print("Hasil                  : "+(angka1 % angka2));
        }
        else {
            System.out.print("System Tidak Mengenali Operator Yang Anda Gunakan");
        }
        
    }
    
}
