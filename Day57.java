package Day57;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    
    public static void main(String[] args) {
        int[]angka = {1, 5, 2, 7, 6, 0, 9, 4, 3};
        
        //konversi array int ke Integer
        Integer[]intArray = Arrays.stream(angka).boxed().toArray(Integer[]::new);
        
        //menggunakan metode Arrays.sort() dengan Collections.reverseOrder()
        Arrays.sort(intArray, java.util.Collections.reverseOrder());
        
        //menampilkan hasil
        System.out.println("Array setelah diurutkan secara menurun "+Arrays.toString(intArray));
    }
    
}
