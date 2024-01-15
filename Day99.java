package Day99;
public class Belajar {
    public static void main (String[] args){
        
        int[]angka = {81, 75, 85, 90, 88, 72, 98};
        int cari = 88;
        
        boolean ditemukan = false;
        for(int i : angka){
            if (i == cari){
                ditemukan = true;
                break;
            }
        }
        if (ditemukan){
            System.out.print("Nilai "+cari+" Ditemukan Dalam Array");
        }
        else{
            System.out.print("Nilai "+cari+" Ditemukan Dalam Array");
        }
    }
}
