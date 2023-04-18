package no.kristiania.pgr203;

import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi. Welcome to Roman Number Conversion Program.");
        System.out.println("Please write a number between 1-3999 to convert to a roman number.");
        int userInput = input.nextInt();
        System.out.println("Your number " + userInput + " written as a roman number is: " + toRoman(userInput));
        input.close();
    }

    public static String toRoman(int number) {

        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V",
                "IV", "I"};

        int[] regularNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder result = new StringBuilder();

        if (number < 1 || number > 3999) {
            return "Invalid number. Please try again.";
        } else {
            for (int i = 0; i < romanNumbers.length; i++) {
                while (number >= regularNumbers[i]) {
                    result.append(romanNumbers[i]);
                    number -= regularNumbers[i];
                }
            }

            return result.toString();
        }

    }

}
