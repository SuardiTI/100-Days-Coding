package Day53;

public class Main {
    
    public static void main(String[] args) {
        //add item di array
        
        int[]arrayAwal = {1, 2, 3, 4, 5, 6 ,7 ,8 ,9};
        
        int newItem = 10; //mendeklarasaikan variabel baru untuk ditambahkan ke dalam array
        
        int[]arrayBaru = new int [arrayAwal.length + 1]; //Membuat array baru dengan ukuran satu elemen lebih besar dari arrayAwal.
        
        for (int i = 0; i < arrayAwal.length; i++){ //digunakan untuk menyalin semua elemen dari arrayAwal ke arrayBaru.
            arrayBaru[i] = arrayAwal[i];
        }
        
        arrayBaru[arrayAwal.length] = newItem; //Menambahkan newItem ke dalam posisi terakhir (arrayAwal.length) dari arrayBaru.
        
        System.out.print("Array setelah penambahan item : "); //mencetak
        
        for(int i : arrayBaru){
            System.out.print(i + " ");//digunakan untuk mencetak setiap elemen dari arrayBaru dengan spasi di antara setiap elemen.
        }
        
    }
    
}
