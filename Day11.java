package Day11;

public class Main {
    
    public static void main(String[] args) {
        /*
        Sambo ingin membeli sebuah pc gaming seharga 150jt, sambo
        adalah seorang pengusaha yang penghasilannya 13jt / bulan,dia 
        harus membayar tagihan rumah 4jt / bulan, dan dia harus membiayai 
        3 orang anaknya yang masih sekolah dan seorang istri, maksimal 
        uang yg dapat dia tabung adalah 5jt/bulan, ank pertamanya harus 
        membayar 2jt/bulan dan 2 orang anaknya lagi harus membayar 1jt/bulan, 
        sisanya diberikan kepada istrinya untuk kebutuhan sehari-hari 
        pertanyaannya, berapa tahun sambo harus menabung untuk  bisa membeli 
        pc gaming tersebut???
        */
        double total_tahun;
        
        double target = 150000000;
        double tabungan= 5000000;
        double bulan = 12;
        
        System.out.print("Total "+(total_tahun = target/tabungan)+" Bulan"+' ');
        
        System.out.print("Atau "+(30.0 / bulan)+" Tahun"+"\n");
        
        System.out.println("Jadi Waktu Yang Dibutuhkan Bagi Sambo Untuk Membeli PC Gaming Seharga 150 Jt Adalah 2.5 Tahun");
    }
    
}
