package Day81;

public class Main{
    
    public static void main(String[]args){
        //StringBuffer
        StringBuffer kata1 = new StringBuffer("Ensiklopedia");
        kata1.deleteCharAt(4);
        System.out.println(kata1);
        
        //StringBuilder
        StringBuilder kata2 = new StringBuilder("IPTEK");
        kata2.deleteCharAt(3);
        System.out.println(kata2);
    }
}
