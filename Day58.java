package Day58;

public class Main {
    
    public static void main(String[] args) {
        //Array 2D
        int[][]angka = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for(int i=0; i<angka.length; i++){
            for(int j = 0; j < angka[i].length; j++){
            System.out.print(angka[i][j] + " ");
            }   
            System.out.println();
        }
        
    }
    
}
