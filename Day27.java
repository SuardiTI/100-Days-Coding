package Day27;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double hasil = 0;
        
        System.out.print("Masukkan Angka              : ");
        double angka1 = in.nextDouble();
        
        System.out.print("Masukkan Operator (+,-,*-/) : ");
        char operator = in.next().charAt(0);
        
        System.out.print("Masukkan Angka              : ");
        double angka2 = in.nextDouble();
        
        switch(operator){
            case '+':
            hasil = angka1 + angka2;
            break;
            
            case '-':
            hasil = angka1 - angka2;
            break;
            
            case '*':
            hasil = angka1 * angka2;
            break;
            
            case '/':
            if(angka2 !=0){
                hasil = angka1 / angka2;
            }
            else{
                System.out.println("Tidak Bisa Membagi Bilangan Dengan 0");
            }
            break;
            
            default:
            System.out.print("Operator Yang Anda Masukkan Tidak Valid");
            break;
        }
        
        System.out.print("Hasil                       : "+hasil);
        
    }
    
}
