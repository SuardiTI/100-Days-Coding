package Day88;

public class Belajar {
    
    String namaDepan;
    String namaBelakang;
    int umur;
    
    public static void main(String []args){
        Belajar contohIsi = new Belajar();
        contohIsi.namaDepan = "Agus";
        contohIsi.namaBelakang = "Sutrisno";
        contohIsi.umur = 35;
        
        System.out.println("Nama Depan    : "+contohIsi.namaDepan);
        System.out.println("Nama Belakang : "+contohIsi.namaBelakang);
        System.out.println("Umur          : "+contohIsi.umur);
    }
}
