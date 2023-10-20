package bai_3;

import java.util.Scanner;
public class Bai_3 {

   static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n;
        System.out.print("Input number : ");
        n = sc.nextInt();
        
        int multiple = 1;
        while(n > 0){
            multiple *= n % 10;
            n /= 10;
        }
        
        System.out.println("Output : " + multiple);
    }
    
}
