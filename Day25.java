package Day25;

public class Main {
    
    public static void main(String[] args) {
        //Type Casting
        
        // Implicit casting (casting otomatis) adalah proses tipe data yang lebih kecil dikonversi ke tipe data yang lebih besar secara otomatis
        // Implicit casting dari int ke double
        int angkaBulat = 10;
        double angkaPecahan = angkaBulat;
        
        
        //Explicit casting (casting manual) adalah konversi tipe data yang lebih besar ke tipe data yang lebih kecil
        // Explicit casting dari double ke int
        double angkaDbl = 7.15;
        int angkaInt = (int) angkaDbl; 
        //dalam explicit casting, kita perlu menggunakan tanda kurung (tipeData) untuk menjelaskan konversi tipe data yang digunakan
        
        System.out.println(angkaPecahan);
        System.out.println(angkaInt);
    }
    
}
