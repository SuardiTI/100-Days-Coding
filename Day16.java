package Day16;
//Pemanggilan BigInteger
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(">>>Kalkulator BigInteger<<<");
        //Masukkan Angka Pertama
        System.out.print("Masukkan Angka              : ");
        BigInteger angka1 = new BigInteger(in.next());
        //Memasukkan Operator
        System.out.print("Masukkan Operator (+,-,/,*) : ");
        char operator = in.next().charAt(0);
        //Memasukkan Angka Kedua
        System.out.print("Masukkan Angka              : ");
        BigInteger angka2 = new BigInteger(in.next());
        
        BigInteger hasil;
        //Pemilihan Operator Yang Akan Digunakan
        if(operator == '+'){
            System.out.print("Hasil                       : "+(hasil = angka1.add(angka2)));
        }
        else if(operator == '-'){
            System.out.print("Hasil                       : "+(hasil = angka1.subtract(angka2)));
        }
        else if(operator == '*'){
            System.out.print("Hasil                       : "+(hasil = angka1.multiply(angka2)));
        }
        else if(operator == '/'){
            //Jika Angka Kedua Adalah Angka 0, Maka Sistem Akan Menolak Eksekusi
            if (angka2.equals(BigInteger.ZERO)) {
                    System.out.println("Tidak Bisa Membagi Bilangan Dengan Nol");
            } 
            else{
            //Jika Bukan Bilangan Nol Maka Akan Dieksekusi    
            System.out.print("Hasil                       : "+(hasil = angka1.divide(angka2)));
            }
        }
        else{
            //Jika Operator Yang Digunakan Diluar Dari Operator Diatas, Maka Sistem Akan Mengeluarkan Pesan Dibawah Ini
            System.out.print("Operator Tidak Valid");
        }
      
    }
    
}
