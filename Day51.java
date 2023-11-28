package Day51;

public class Main {
    
    public static void main(String[] args) {
        
        int [] angka = {100, 200, 300, 400, 500};
        
        System.out.println("Elemen Pada Index 0 : "+angka[0]);
        System.out.println("Elemen Pada Index 1 : "+angka[1]);
        System.out.println("Elemen Pada Index 3 : "+angka[3]);
        System.out.println("Elemen Pada Index 4 : "+angka[4]);
        
        angka[2] = 600;
        System.out.println("Elemen Pada Index 2 Setelah Mengalami Perubahan : "+angka[2]);
        
        
    }
    
}
