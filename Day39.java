package Day39;

public class Main {
    
    public static void main(String[] args) {
        /*Break
        Jika nilai i mencapai nilai yang telah ditentukan, maka pernyataan
        break akan dijalankan dan program akan keluar dari loop*/
        
        for(int i=1; i < 50; i++){
            if(i == 30){ //program akan berhenti ketika nilai i sama dengan 30
                break;
            }
            System.out.println(i);
        }
    }
    
}
