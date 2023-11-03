package Day26;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        //menyelesaikan kasus membuat angka berurut dari angka terkecil ke angka terbesar sesuai inputan
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Angka Pertama : ");
        int a = in.nextInt();
        
        System.out.print("Masukkan Angka Kedua   : ");
        int b = in.nextInt();
        
        //Jika Angka Pertama Lebih Besar Dari Angka Kedua
        if(a>b){
            for (int angka=b; b<=a; b++){
                System.out.print(b+" ");
            }
        }
        //Jika Angka Kedua Lebih Besar Dari Angka Pertama
        else{
            for (int angka=a; a<=b; a++){
                System.out.print(a+" ");
            }
        }
        
    }
    
}
