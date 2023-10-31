package bai3;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        int S_chu = 0;
        int S_so = 0;
        int S_ky_tu = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i)  <= 'z' || s.charAt(i) >='A' && s.charAt(i) <= 'Z') {
                S_chu++;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                S_so++;
            } else
                S_ky_tu++;
        }
        System.out.println(S_chu + " " + S_so + " " + S_ky_tu);
        sc.close();
    }
    
}
