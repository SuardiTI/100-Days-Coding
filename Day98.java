package Day98;
public class Belajar {
    public static void main (String[] args){
        
        int[]angka = {81, 75, 85, 90, 88, 72, 98};
        
        int terbesar = angka[0];
        
        for(int i : angka){
            if( i > terbesar){
                terbesar = i;
            }
        }
        System.out.print("Angka Terbesar : "+terbesar);
    }
}
