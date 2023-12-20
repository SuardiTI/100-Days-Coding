package Day74;

public class Main{
    
    public static void main(String[]args){
        //inisiasi StringBuffer
        StringBuffer kata1 = new StringBuffer("Saya");
        //append() untuk menambahkan teks
        kata1.append(" pergi").append(" ke").append(" kampus");
        
        System.out.println(kata1.toString());
        
        //inisiasi StringBuilder
        StringBuilder kata2 = new StringBuilder("Belajar");
        //append untuk menambahkan teks
        kata2.append(" bahasa").append(" Java");
        
        System.out.println(kata2.toString());
     }
}
