package pkg2sayı_toplamı;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        
        System.out.println("x sayisini giriniz: ");
        x = input.nextInt();
        
        System.out.println("y saisini girniz: ");
        y = input.nextInt();
        
        System.out.println("Girdiniginiz sayilar toplami:"+ (x+y));
        
    }
    
}
