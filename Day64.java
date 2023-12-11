package Day64;

public class Main{

    public static void main(String[]args){
        int jumlah = tambah (10, 20);
        System.out.println("Hasil Tambah "+jumlah);
        
        String nama = namaSaya("Jhon ", "Alexandra");
        System.out.println("Nama : "+nama);
    }
    public static int tambah (int x, int y){
        return x + y;
    }
    public static String namaSaya(String namaDepan, String namaBelakang){
        return namaDepan + namaBelakang;
    }
        
}
