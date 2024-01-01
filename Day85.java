package Day85;
import java.util.Scanner;
public class Main{
    
    public static void main(String[]args){
        
        Scanner x = new Scanner(System.in);
        
        System.out.print("Masukkan Kata : ");
        String kata = x.nextLine();
        
        if(isPalindrome(kata)){
            System.out.println("Ini Palindrome");
        }
        else{
            System.out.println("Ini Bukan Palindrome");
        }
    }
    static boolean isPalindrome (String abc){
        return abc.equals(new StringBuilder(abc).reverse().toString());
    }
}
