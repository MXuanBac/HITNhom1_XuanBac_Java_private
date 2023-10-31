package bai4;

import java.util.Scanner;

public class Bai4 {

 public static boolean Check(String s){
        boolean[] check= new boolean[26];
        for (int i = 0; i < 26; i++) {
            check[i]=false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c>='a'&& c<= 'z')
                check[c-'a']=true;
        }
        for (boolean i:check) {
            if(i == false)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        System.out.print("Nhap chuoi: ");
        s = scan.nextLine();
        String lowerCase = s.toLowerCase();
        if(Check(lowerCase)) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}
