package Day69;
import java.util.ArrayList;
public class Main{
    
    public static void main(String[]args){
        int[]angka = {10, 20, 30, 40, 50};
        
        //length digunakan untuk mendapatkan berapa panjang array
        int panjang = angka.length;
        System.out.println("Panjang Array    : "+panjang);
        
        
        ArrayList<Integer> nomor = new ArrayList<>();
        
        nomor.add(60);
        nomor.add(70);
        nomor.add(80);
        nomor.add(90);
        nomor.add(100);
        //size() digunakan untuk mendapatkan ukuran ArrayList
        int ukuran = nomor.size();
        System.out.println("Ukuran ArrayList : "+ukuran);
        
    }
        
}
