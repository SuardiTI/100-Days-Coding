package Day78;

public class Main{
    
    public static void main(String[]args){
        //String.format()
        String namaProduk = "Sepeda Motor";
        int harga = 20000000;
        double diskon = 0.10;
        
        String afterFormat = String.format("Produk : %s, Harga : %d, Diskon : %.2f%%", namaProduk, harga, diskon * 100);
        
        System.out.print(afterFormat);

    }
}
