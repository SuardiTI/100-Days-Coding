package Day100;
import java.util.Arrays;
public class Belajar {
    public static void main (String[] args){
        //penggabungan array
      
        int[] array1 = {10, 11, 12};
        int[] array2 = {13, 14, 15};
        
        //menggabungkan 2 array
        int[] gabungan = new int [array1.length + array2.length];
        System.arraycopy(array1, 0, gabungan, 0, array1.length);
        System.arraycopy(array2, 0, gabungan, array1.length, array2.length);
        
        System.out.print(Arrays.toString(gabungan));
        
    }
}
