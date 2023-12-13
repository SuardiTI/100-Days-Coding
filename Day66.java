package Day66;

public class Main{
    public static String nama( String namaDepan, String namaBelakang){
        return namaDepan + namaBelakang;
    }
    public static void main(String[]args){
        String namaLengkap = nama("Budi ", "Santoso");
        
        System.out.print("Nama Lengkap : "+namaLengkap);
        
    }
        
}
