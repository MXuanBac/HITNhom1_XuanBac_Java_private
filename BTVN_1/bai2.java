package bai_2;

import java.util.Scanner;

public class bai2 {
	
    public static void doiCoSo(int n,int base){
        if(n>=base) doiCoSo(n / base, base);
        if(n%base > 9) System.out.printf("%c",n%base+55);
        else
        System.out.print((n % base));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
	int n= sc.nextInt();
	System.out.print("Nhập hệ cơ số: ");
	int b= sc.nextInt();
	System.out.print("Số " +n+ " hệ 10 chuyển sang hệ " +b+ " là: ");
	doiCoSo(n,b);        
    }
        
}
