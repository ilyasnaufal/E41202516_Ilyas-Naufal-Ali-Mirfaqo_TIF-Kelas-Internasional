
import java.util.Scanner;

public class TugasArrayE {
    public static void main(String[] args) {
    
        System.out.println("     CAFE CERIA      ");
        System.out.println("    ANEKA MINUMAN        ");
        System.out.println("------------------------------------");
        System.out.println("    SPECIAL MENU :");
        
        String[] menu = {"", "Soft Drinks","Mix Juice","Nescafe","Soda Milk","Tea"};
        String pembeli;
        Scanner scan = new Scanner(System.in);
        
        for(int i=1; i<menu.length; i++) {
           System.out.println(+i+". " +menu[i]);                      
    }
        System.out.println("------------------------------------");
                System.out.print("Masukkan nama pembeli : ");
           pembeli =  scan.nextLine();
        System.out.println("");
        
        System.out.print("Silahkan masukkan pilihan Anda : ");
           menu[0] =  scan.nextLine();
        switch (menu[0]) {
            case "1" :
                System.out.println("Minuman yang Anda Pesan adalah " +menu[1]);
                break;
            case "2" :
                System.out.println("Minuman yang Anda Pesan adalah " +menu[2]);
                break;    
            case "3" :
                System.out.println("Minuman yang Anda Pesan adalah " +menu[3]);
                break;    
            case "4" :
                System.out.println("Minuman yang Anda Pesan adalah " +menu[4]);
                break;    
            case "5" :
                System.out.println("Minuman yang Anda Pesan adalah " +menu[5]);
                break;
            default:
                    System.out.println("Maaf menu tidak tersedia");
        
                            }
        System.out.println("Pesanan akan segera kami antar");
                    System.out.println("Terima Kasih " +pembeli +" Telah berkunjung di Cafe Ceria");
        
            
            
        }
        
    }
    

