package Day59;

public class Main {
    
    public static void main(String[] args) {
        //Array 2D
        int[][]angka = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        
        for(int i=0; i<angka.length; i++){
            for(int j = 0; j < angka[i].length; j++){
            System.out.print(angka[i][j] + " ");
            }   
            System.out.println();
        }
        //menghitung jumlah elemen dalam baris kedua
        int jumlahBarisKedua = 0;
        for (int j = 0; j < angka[1].length; j++) {
            jumlahBarisKedua += angka[1][j];
        }

        System.out.println("Jumlah elemen dalam baris kedua: " + jumlahBarisKedua);
    

    }
    
}
