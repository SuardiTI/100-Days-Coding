package Day60;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        //menghitung ada berapa angka ganjil dan genap dalam angka yang di input
        Scanner x = new Scanner(System.in);
        int ganjil = 0;
        int genap = 0;
        
        System.out.print("Masukkan Angka : ");
        int angka = x.nextInt();
        
        for (int i=1; i<=angka; i++){
            if(i%2 ==0){
                genap+=1;
            }
            else{
                ganjil+=1;
            }
        }
        System.out.print("Total Angka Genap  : "+genap);
        System.out.print("\n"+"Total Angka Ganjil : "+ganjil);
    }
    
}
