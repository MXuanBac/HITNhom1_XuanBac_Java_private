package bai2;

import java.util.Scanner;

public class Bai2 {

     public static void Tong_S(int[] arr, Scanner sc){
        int L, R;
        int S = 0;
        do {
            System.out.print("Gioi han trai: ");
            L = sc.nextInt();
            System.out.print("Gioi han phai: ");
            R = sc.nextInt();
            if(L>0 && L <= arr.length && R<= arr.length && R>=L) {
                for (int i = L - 1; i < R; i++) {
                    S += arr[i];
                }
            System.out.println(S);
            }else {
                System.out.println("Nhap lai...");
            }
        }while (L<0 || L> arr.length || R >= arr.length || R<L);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int q;
        System.out.print("Nhap mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("So lan muon truy xuat: ");
        q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            Tong_S(arr, sc);
        }
        sc.close();
    }
    
}
