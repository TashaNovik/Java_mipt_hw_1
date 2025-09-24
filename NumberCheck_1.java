package hw_1;

import java.util.Scanner;

public class NumberCheck_1 {
    public static boolean isPalindrome(int number) {
        if (number < 0 || (number % 10 == 0 && number != 0)) {
            return false;
        }

        int revertedNumber = 0;
        int originalNumber = number;

        while (number > revertedNumber) {
            int remainder = number % 10;
            revertedNumber = revertedNumber * 10 + remainder;
            number /= 10;
        }

        return number == revertedNumber || number == revertedNumber / 10;
    }

    public static void main(String[] args) {
        // int num1 = 121;
        // int num2 = -121;
        // int num3 = 10;
        // int num4 = 12321;
        //или
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.println(num1 + " является палиндромом? " + isPalindrome(num1));
        System.out.println(num2 + " является палиндромом? " + isPalindrome(num2));
        System.out.println(num3 + " является палиндромом? " + isPalindrome(num3));
        System.out.println(num4 + " является палиндромом? " + isPalindrome(num4));
    }
}
