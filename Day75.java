package Day75;

public class Main{
    
    public static void main(String[]args){
        //Split String
        String kalimat = "Saya Pergi Ke Kampus Lima Hari Dalam Satu Minggu";
        
        //dipecah berdasarkan spasi
        String[] kataKata = kalimat.split(" ");
        
        System.out.println("Kalimat Setelah Dipecah : ");
        for (String kata : kataKata){
            System.out.println(kata);
        }
     }
}
