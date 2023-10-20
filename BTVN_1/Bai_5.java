package bai_5;

import java.util.*;
public class Bai_5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Nhập 5 số nguyên: ");
        for (int i = 0; i < 5; i++) {
            number.add(i, sc.nextInt());
        }

        number.sort(Comparator.reverseOrder());

        System.out.println(number.get(1) + " " +  number.get(0));

    }

}
   
