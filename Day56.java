package Day56;
import java.util.Arrays;
public class Main {
    
    public static void main(String[] args) {
        
        int[]angka = {6, 4, 9, 3, 7, 2, 1, 5, 8, 0};
        
        System.out.println("Sebelum Diurutkan : "+Arrays.toString(angka));
        
        Arrays.sort(angka);
        System.out.println("Setelah Diurutkan : "+Arrays.toString(angka));
        
    }
    
}
