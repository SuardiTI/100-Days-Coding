package Day76;
import java.util.Scanner;
public class Main{
    
    public static void main(String[]args){
        //String equals()
        Scanner x = new Scanner(System.in);
        
        while(true){
            System.out.print("Masukkan Password : ");
            String psswd = x.nextLine();
            
            if(psswd.equals("Suardi1234")){
                System.out.println("Login Berhasil");
                break;
            }
            else{
                System.out.println("Login Gagal. Masukan Password Dengan Benar");
            }
        }
    }
}
