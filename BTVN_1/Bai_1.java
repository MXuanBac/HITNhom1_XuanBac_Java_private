package bai_1;

import java.util.Scanner;

public class Bai_1 {
    static Scanner sc = new Scanner(System.in);
    
    static int USCLN(int a , int b){
        if(b == 0)  return a;
        
        return USCLN(b , a % b);
    }
    
    static int BSCNN(int a, int b, int c) {
        int bcnn = (a * b) / USCLN(a, b);
        return (bcnn * c) / USCLN(bcnn, c);
    }
    
    public static void main(String[] args) {
        int a , b , c;
        System.out.print("Input a : "); 
        a = sc.nextInt();
        System.out.print("Input : "); 
        b = sc.nextInt();
        System.out.print("Input c : "); 
        c = sc.nextInt();
        
        System.out.println("USCLN : " + USCLN(USCLN(a,b),c));
        System.out.println("BSCNN : " + BSCNN(a, b, c));
        
       }
}