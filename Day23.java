package Day23;
import java.math.BigDecimal;
public class Main {
    
    public static void main(String[] args) {
        //angka 1
        BigDecimal angka1 = new BigDecimal("100.588999");
        //angka 2
        BigDecimal angka2 = new BigDecimal("20.59999");
        
        //operasi penjumlahan
        BigDecimal tambah = angka1.add(angka2);
        System.out.println( "Hasil Tambah : "+tambah);
        
        //operasi pengurangan   
        BigDecimal kurang = angka1.subtract(angka2);
        System.out.println( "Hasil Kurang : "+kurang);
        
        //operasi perkalian
        BigDecimal kali = angka1.multiply(angka2);
        System.out.println( "Hasil Kali   : "+kali);
        
        //operasi pembagian   
        BigDecimal bagi = angka1.divide(angka2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println( "Hasil Bagi   : "+bagi);
    }
    
}
