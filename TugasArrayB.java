import java.util.Scanner;

public class TugasArrayB {
    public static void main(String[] args) {
        // membuat objek input untuk di scanner
        Scanner input = new Scanner(System.in);
        int jumlahderet = 0;
        
        System.out.print("Masukan jumlah deret : ");
        jumlahderet = input.nextInt();
        
        int[] deretarray = new int [jumlahderet];
        
        for (int i=0; i<jumlahderet; i++) {
            deretarray[i] = (int) (Math.random()* 10);
        }
        for (int a=0; a<jumlahderet; a++) {
            System.out.print(deretarray[a]+"\t");
            
        
        }
        
                
    }
    
    }
    

