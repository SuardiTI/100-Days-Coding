package Day24;

public class Main {
    
    public static void main(String[] args) {
        //Konversi tipe data primitif ke tipe data String
        
        //dengan menggunakan String.valueOf()
        System.out.println(">>>Dengan String.valueOf()<<<");
        int nomor = 12;
        double angka = 14.5;
        
        System.out.println(String.valueOf(nomor));
        System.out.println(String.valueOf(angka));
        
        //dengan menggunakan operator konkatenasi '+'
        System.out.println("\n"+">>>Dengan Operator Konkatenasi '+'<<<");
        int jumlah = 123;
        float pecahan = 12.5f;
        
        System.out.println(""+jumlah);
        System.out.println(""+pecahan);
    }
    
}
