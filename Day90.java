package Day90;
import java.util.Scanner;
public class Belajar {
    
    public static double volumeBola (double PI, double jari_jari){
        double volume = (4 * PI * jari_jari * jari_jari * jari_jari) / 3;
        return volume;
    }
    
    public static void main(String []args){
        Scanner x = new Scanner(System.in);
        
        System.out.print("Masukkan Jari-Jari       : ");
        double r = x.nextDouble();
        
        double hasil = volumeBola (3.14, r);
        
        System.out.println("Volume Bola              = "+hasil+" cm^3");
        System.out.println("Dikoversi Ke Meter Kubik = "+ hasil * 0.000001+" m^3");
    }
}
