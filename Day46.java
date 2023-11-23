package Day46;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        
        double total_harga = 0;
        double diskon = 0.05;
        
        //VIVO || KODE DISKON = DISKONAKHIRTAHUN & DISKONTAHUNBARU
        double iqoo = 9999999;
        double v29 = 6999999;
        double v27 = 4999999;
        //OPPO || KODE DIDKON = DISKONDESEMBER & DISKONNATAL
        double a1k = 1599999;
        double a12 = 2499999;
        double a92 = 4999999;
        //REALME || KODE DISKON = DISKONNOVEMBER & DISKONBARU
        double c15 = 2499999;
        double narzo = 1999999;
        double c30 = 2799999;
        //SAMSUNG || KODE DISKON = DISKONHAPPY & DISKONSENANGSENANG
        double a24 = 2499999;
        double a34 = 2999999;
        double a54 = 3999999;
        
        
        System.out.println(">>>SELAMAT DATANG DI SUARDI CELL<<<");
        System.out.println("1. VIVO");
        System.out.println("2. OPPO");
        System.out.println("3. REALME");
        System.out.println("4. SAMSUNG");
        System.out.print("MERK HP       : ");
        int pilihan = x.nextInt();
        
        
        if(pilihan == 1){
            System.out.println("1. VIVO IQOO 11	- Rp9.999.999");
            System.out.println("2. VIVO V29	- Rp6.999.999");
            System.out.println("3. VIVO V27	- Rp4.999.999");
            System.out.print("Masukkan Type : ");
            int type = x.nextInt();
            x.nextLine();
            System.out.print("Punya Kartu Member (Ya/Tidak)? : ");
            String kartu  = x.nextLine();
            
            if(kartu.equalsIgnoreCase("Ya")){
                System.out.println("Mendapatkan Diskon 5%");
                System.out.print("Masukkan Kode Diskon : ");
                String kode = x.nextLine();
                
                if(kode.equals("DISKONAKHIRTAHUN") || kode.equals("DISKONTAHUNBARU")){
                    System.out.println("Berhasil Mendapatkan Diskon 5%");
                    if(type == 1){
                        total_harga = iqoo-(iqoo*diskon);
                    }
                    else if(type == 2){
                        total_harga = v29-(v29*diskon);
                    }
                    else if(type == 3){
                        total_harga = v27-(v27*diskon);
                    }else{
                        System.out.println("PILIHAN TIDAK TERSEDIA, MOHON PILIH SESUAI KETERSEDIAAN");
                    }
                }else{
                    System.out.println("KODE DISKON SALAH, MOHON MASUKKAN YANG BENAR UNTUK MENDAPATKAN DISKON");
                }
            }else if(kartu.equalsIgnoreCase("Tidak")){
                    if(type == 1){
                        total_harga = iqoo;
                    }
                    else if(type == 2){
                        total_harga = v29;
                    }
                    else if(type == 3){
                        total_harga = v27;
                    }else{
                        System.out.println("PILIHAN TIDAK TERSEDIA, MOHON PILIH SESUAI KETERSEDIAAN");
                    }
            }else{
                System.out.println("MOHON MASUKKAN PILIHAN YANG BENAR");
            }
            
        }
        else if(pilihan == 2){
            System.out.println("1. OPPO A1K	- Rp1.599.999");
            System.out.println("2. OPPO A12	- Rp2.499.999");
            System.out.println("3. OPPO A92	- Rp4.999.999");
            System.out.print("Masukkan Type : ");
            int type = x.nextInt();
            x.nextLine();
            System.out.print("Punya Kartu Member (Ya/Tidak)? : ");
            String kartu  = x.nextLine();
            
            if(kartu.equalsIgnoreCase("Ya")){
                System.out.println("Mendapatkan Diskon 5%");
                System.out.print("Masukkan Kode Diskon : ");
                String kode1 = x.nextLine();
                
                if(kode1.equals("DISKONDESEMBER") || kode1.equals("DISKONNATAL")){
                    System.out.println("Berhasil Mendapatkan Diskon 5%");
                    if(type == 1){
                        total_harga = a1k-(a1k*diskon);
                    }
                    else if(type == 2){
                        total_harga = a12-(a12*diskon);
                    }
                    else if(type == 3){
                        total_harga = a92-(a92*diskon);
                    }else{
                        System.out.println("PILIHAN TIDAK TERSEDIA, MOHON PILIH SESUAI KETERSEDIAAN");
                    }
                }else{
                    System.out.println("KODE DISKON SALAH, MOHON MASUKKAN YANG BENAR UNTUK MENDAPATKAN DISKON");
                }
            }else if(kartu.equalsIgnoreCase("Tidak")){
                    if(type == 1){
                        total_harga = a1k;
                    }
                    else if(type == 2){
                        total_harga = a12;
                    }
                    else if(type == 3){
                        total_harga = a92;
                    }else{
                        System.out.println("PILIHAN TIDAK TERSEDIA, MOHON PILIH SESUAI KETERSEDIAAN");
                    }
            }else{
                System.out.println("MOHON MASUKKAN PILIHAN YANG BENAR");
            }
            
        }else if(pilihan == 3){
            System.out.println("1. REALME C15		- Rp2.499.999");
            System.out.println("2. REALME NARZO 20	- Rp1.999.999");
            System.out.println("3. REALME C30		- 2.799.999");
            System.out.print("Masukkan Type : ");
            int type = x.nextInt();
            x.nextLine();
            System.out.print("Punya Kartu Member (Ya/Tidak)? : ");
            String kartu  = x.nextLine();
            
            if(kartu.equalsIgnoreCase("Ya")){
                System.out.println("Mendapatkan Diskon 5%");
                System.out.print("Masukkan Kode Diskon : ");
                String kode1 = x.nextLine();
                
                if(kode1.equals("DISKONNOVEMBER") || kode1.equals("DISKONBARU")){
                    System.out.println("Berhasil Mendapatkan Diskon 5%");
                    if(type == 1){
                        total_harga = c15-(c15*diskon);
                    }
                    else if(type == 2){
                        total_harga = narzo-(narzo*diskon);
                    }
                    else if(type == 3){
                        total_harga = c30-(c30*diskon);
                    }else{
                        System.out.println("PILIHAN TIDAK TERSEDIA, MOHON PILIH SESUAI KETERSEDIAAN");
                    }
                }else{
                    System.out.println("KODE DISKON SALAH, MOHON MASUKKAN YANG BENAR UNTUK MENDAPATKAN DISKON");
                }
            }else if(kartu.equalsIgnoreCase("Tidak")){
                    if(type == 1){
                        total_harga = c15;
                    }
                    else if(type == 2){
                        total_harga = narzo;
                    }
                    else if(type == 3){
                        total_harga = c30;
                    }else{
                        System.out.println("PILIHAN TIDAK TERSEDIA, MOHON PILIH SESUAI KETERSEDIAAN");
                    }
            }else{
                System.out.println("MOHON MASUKKAN PILIHAN YANG BENAR");
            }
        
        }
        else if(pilihan == 4){
            System.out.println("1. SAMSUNG GALAXY A24	- Rp2.499.999");
            System.out.println("2. SAMSUNG GALAXY A34	- Rp2.999.999");
            System.out.println("3. SAMSUNG GALAXY A54	- Rp3.999.999");
            System.out.print("Masukkan Type : ");
            int type = x.nextInt();
            x.nextLine();
            System.out.print("Punya Kartu Member (Ya/Tidak)? : ");
            String kartu  = x.nextLine();
            
            if(kartu.equalsIgnoreCase("Ya")){
                System.out.println("Mendapatkan Diskon 5%");
                System.out.print("Masukkan Kode Diskon : ");
                String kode1 = x.nextLine();
                
                if(kode1.equals("DISKONHAPPY") || kode1.equals("DISKONSENANGSENANG")){
                    System.out.println("Berhasil Mendapatkan Diskon 5%");
                    if(type == 1){
                        total_harga = a24-(a24*diskon);
                    }
                    else if(type == 2){
                        total_harga = a34-(a34*diskon);
                    }
                    else if(type == 3){
                        total_harga = a54-(a54*diskon);
                    }else{
                        System.out.println("PILIHAN TIDAK TERSEDIA, MOHON PILIH SESUAI KETERSEDIAAN");
                    }
                }else{
                    System.out.println("KODE DISKON SALAH, MOHON MASUKKAN YANG BENAR UNTUK MENDAPATKAN DISKON");
                }
            }else if(kartu.equalsIgnoreCase("Tidak")){
                    if(type == 1){
                        total_harga = a24;
                    }
                    else if(type == 2){
                        total_harga = a34;
                    }
                    else if(type == 3){
                        total_harga = a54;
                    }else{
                        System.out.println("PILIHAN TIDAK TERSEDIA, MOHON PILIH SESUAI KETERSEDIAAN");
                    }
            }else{
                System.out.println("MOHON MASUKKAN PILIHAN YANG BENAR");
            }
        }
        else{
            System.out.println("PILIHAN TIDAK TERSEDIA, MOHON PILIH SESUAI KETERSEDIAAN");
        }
        
        System.out.println("Total Harga Rp"+total_harga);
    
   } 
}
