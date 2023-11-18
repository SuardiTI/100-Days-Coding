package Day41;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        
        while(true){
        
        System.out.print("Masukkan Username : ");
        String usrnm = x.nextLine();
        System.out.print("Masukkan Password : ");
        String psswd = x.nextLine();
        
        if(usrnm.equals("SuardiTI")&& psswd.equals("Suardi1234")){
            System.out.println("Login Berhasil");
            return;//return akan menghentikan eksekusi program
        }
        else{
            System.out.println("Username/Password Salah! Silahkan Masukkan Yang Benar");
        }
        }
    }
    
}
