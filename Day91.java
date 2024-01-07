package Day91;

public class Belajar {
    //class di dalam class
    public class Membaca{
        public void cetak(){
            System.out.println("Saya Belajar Bahasa Java");
        }
    }
    public static void main (String []args){
        //membuat objek dari class Membaca
        Belajar objek1 = new Belajar();
        Belajar.Membaca objek2 = objek1. new Membaca();
        //memanggil fungsi cetak 
        objek2.cetak();
    }

}
