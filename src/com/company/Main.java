package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String aString,bString,cString;
        int a,b, result;
        char c;

        Operation add = new Add();
        Operation sub = new Substract();
        Operation mult = new Multiply();
        Operation div = new Division();



        System.out.println("Welcome! I can:");
        System.out.println(2 +" + " + 2 + " = " +add.execute(2,2));
        System.out.println(9 +" - " + 4 + " = " +sub.execute(9,4));
        System.out.println(36 +" / " + 6 + " = " +div.execute(36,6));
        System.out.println(6 +" + " + 4 + " = " +mult.execute(6,4));
        System.out.println("write \"end\" to exit :)");

        while (true) {
            aString = scanner.next();
            cString = scanner.next();
            bString = scanner.next();

            if (aString.equals("end") || bString.equals("end") || cString.equals("end")) {
                break;
            }
            c = cString.charAt(0);
            a = Integer.parseInt(aString);
            b = Integer.parseInt(bString);

            switch (c) {
                case '+': {
                    result = add.execute(a,b);
                    break;
                }
                case '-': {
                    result = sub.execute(a,b);
                    break;
                }
                case '/': {
                    result = div.execute(a,b);
                    break;
                }
                case '*': {
                    result = mult.execute(a,b);
                    break;
                }
                default: {
                    System.out.println("invalid operation! try again");
                    continue;
                }
            }


            System.out.println("" + a +" "+ c +" "+ b + " = " + result);
        }
        System.out.println("Good bye!");


    }
}
