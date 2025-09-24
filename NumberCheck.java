package hw_1;

import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
        // Напишите программу на Java, которая будет проверять, является ли число палиндромом.
        // Пока что пользовательский ввод конвертируем в строку
        String userInput = getUserInput();
        boolean isUserInputValid = checkIsInputValid(userInput);
        if (isUserInputValid) {
            boolean isInputPalindrom = checkIsInputPalindrom(userInput);
            System.out.println(isInputPalindrom);
        }else{
            System.out.println(false);
        }
    }

    private static boolean checkIsInputPalindrom(String userInput) {
        boolean isInputPalindrom = false;
        StringBuilder sb = new StringBuilder(userInput);
        sb.reverse();
        String reversed = sb.toString();
        if (userInput.equals(reversed)) {
            isInputPalindrom = true;
        }
        return isInputPalindrom;
    }

    private static boolean checkIsInputValid(String userInput) {
        boolean isInputValid = false;
        if (userInput != null) {
            if (!userInput.isEmpty() && !userInput.isBlank() && (userInput.chars().allMatch(Character::isDigit))) {
                isInputValid = true;
            }
        }
        return isInputValid;
    }

    private static String getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число целое число:");
        return sc.nextLine();
    }
}
