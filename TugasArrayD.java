import java.util.Scanner;

public class TugasArrayD {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------");
        System.out.println("         Kharisma Agung Plaza < KAP >");
        System.out.println("           Promo Belanja Berhadiah    ");
        System.out.println("        Khusus Pembelian 5 Barang Pertama    ");
        System.out.println("         Dengan harga minimum Rp.100.000,00 ");
        System.out.println("-------------------------------------------------------");
        
        String nama;
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        
        
        System.out.println(" ");
        System.out.println("Masukkan harga barang ke-1     : 10.000");
        System.out.println("Masukkan harga barang ke-2     : 20.000");
        System.out.println("Masukkan harga barang ke-3     : 15.000");
        System.out.println("Masukkan harga barang ke-4     : 45.000");
        System.out.println("Masukkan harga barang ke-5     : 10.000");
        System.out.println("Total harga pembelian atas nama "+ nama + " adalah Rp.100.000,00");
        System.out.println("");
        System.out.println("Selamat....");
        System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("                  Terima Kasih");
        System.out.println("    Anda sudah belanja di Kharisma Agung Plaza");
        
        
    
    }
    
}
