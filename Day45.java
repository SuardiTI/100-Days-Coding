package Day45;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        /*Menyelesaikan Kasus
Buatlah program yang dapat mengetahui penghasilan bersih tiap bulan seseorang dengan ketentuan sebagai berikut:
1. Jika Penghasilan minimal 3jt maka dikenakan pajak 5%
2. Jika penghasilan per bulan minimal 5jt maka dikenakan pajak 10%
3. Jika Jenis Pekerjaan adalah PNS maka Pajak ditambah 5%
4. Selain itu maka tidak kena pajak
5. Penghasilan dan Jenis Pekerjaan di input menggunakan fungsi input()*/
        
        Scanner x = new Scanner(System.in);
        
        double total_gaji = 0;
        double pajak1 = 0.05;
        double pajak2 = 0.10;
        
        System.out.print("Masukkan Penghasilan Anda Rp   : ");
        double gaji = x.nextDouble();
        
        x.nextLine();/*ini digunakan agar sistem membersihkan newline yang ada di buffer setelah 
                     membaca input double, sehingga dapat membaca input String di bawah.*/
        
        System.out.print("Jenis Pekerjaan (PNS) Ya/Tidak : ");
        String pilihan = x.nextLine();
        
        if(pilihan.equalsIgnoreCase("Ya")){
            if (gaji >=5000000){
                total_gaji = (gaji-(gaji*(pajak2+pajak1)));
                System.out.println("Gaji Anda Dikenakan Pajak Sebesar 15%");
            }
            else if(gaji >= 3000000){
                total_gaji = (gaji-(gaji*(pajak1+pajak1)));
                System.out.println("Gaji Anda Dikenakan Pajak Sebesar 10%");
            }
            else{
                total_gaji = gaji;
                System.out.println("Gaji Anda Tidak Dikenakan Pajak");
            }
        }
        else if(pilihan.equalsIgnoreCase("Tidak")){
            if(gaji >=5000000){
                total_gaji = gaji-(gaji*pajak2);
                System.out.println("Gaji Anda Dikenakan Pajak 10%");
                
            }
            else if(gaji >=3000000){
                total_gaji = gaji-(gaji*pajak1);
                System.out.println("Gaji Anda Dikenakan Pajak 5%");
            }
            else{
            total_gaji = gaji;
            System.out.println("Gaji Anda Tidak Dikenakan Pajak");
            }
        }
        else{
            System.out.println("MASUKAN TIDAK VALID, HARAP MASUKKAN PILIHAN YANG BENAR PADA JENIS PEKERJAAN!");
        }
        
        System.out.println("Total Gaji Bersih Anda Bulan Ini Adalah Rp"+total_gaji);
        
        x.close();
    }
}
