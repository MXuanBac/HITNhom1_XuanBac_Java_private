package bai_4;

import java.util.*;
public class Bai_4 {

        static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String phepToan;
        System.out.print("Get input : ");
        phepToan = sc.nextLine().trim();

        String[] p = phepToan.split(" ");
        if (p.length != 3) {
            System.out.println("Wrong condition ! ");
            return;
        }

        String num1 = p[0];
        String operator = p[1];
        String num2 = p[2];

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        if(operator.equals("+")) {
            System.out.println(number1 + number2);
        }
        else if(operator.equals("-")) {
            System.out.println(number1 - number2);
        }
        if(operator.equals("*")) {
            System.out.println(number1 * number2);
        }
        if(operator.equals("/")) {
            System.out.println(number1 / number2);
        }
    }
    
}
