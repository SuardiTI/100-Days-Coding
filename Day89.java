package Day89;

public class Belajar {
    
    String namaDepan;
    String namaBelakang;
    int umur;
    
    //fungsi untuk menampilkan biodata
    public void mencetak(){
        System.out.println("Nama Depan    : "+namaDepan);
        System.out.println("Nama Belakang : "+namaBelakang);
        System.out.println("Umur          : "+umur);
    }
    public static void main(String []args){
        Belajar isi = new Belajar();
        isi.namaDepan = "Agus";
        isi.namaBelakang = "Sutrisno";
        isi.umur = 35;
        
        //memanggil fungsi untuk menampilkan biodata
        isi.mencetak();
    }
}
