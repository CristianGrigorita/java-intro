package operations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the corresponding number for the operation you want to make");
        System.out.println("1. Calculate the sum of the first 100 numbers higher than 0");
        System.out.println("2. Display the smallest number from an array of number");
        System.out.println("3. Display the max digit from a number.");
        System.out.println("4. Check if a number is palindrome( e.g palindrome 1221, 34143)");
        System.out.println("5. Display all the prime numbers lower than a given number");
        System.out.println("6. All");
        String operationInput = scanner.nextLine();
        int choseOperation = Integer.parseInt(operationInput);

        //      1. Calculate the sum of the first 100 numbers higher than 0
        if(choseOperation == 1 || choseOperation == 6) {
            OneHundredSum hundredSum = new OneHundredSum();
            int sumResult = hundredSum.Sum();
            System.out.println("First 100 numbers > 0 sum: " + sumResult);
        }


        //      2. Display the smallest number from an array of number
        if(choseOperation == 2 || choseOperation == 6) {
            System.out.println("Please insert the number array you want to be sorted. Divide by space each number.");
            String inputNumbers = scanner.nextLine();
//            int[] numbersArr = getArray(inputNumbers);
            SmallestNumber smallest = new SmallestNumber();
            System.out.println("Smallest number in array found with for loop: " + smallest.smallestInArray(inputNumbers));
            System.out.println("Smallest number in array found with Array Sort: " + smallest.sortArray(inputNumbers));
        }

        //       3. Display the max digit from a number.
        if(choseOperation == 3 || choseOperation == 6) {
            MaxDigit maxDigit = new MaxDigit();
            System.out.println("Please insert the number");
            int maxDigitNr = Integer.parseInt(scanner.nextLine());
            System.out.println("Max digit of a number: " + maxDigit.findMaxDigit(maxDigitNr));
        }

        //       4. Check if a number is palindrome( e.g palindrome 1221, 34143)
        if(choseOperation == 4 || choseOperation == 6)
        {
            System.out.println("Please insert the number you want to check");
            int palindromeNr =  Integer.parseInt(scanner.nextLine());
            Palindrome palindrome = new Palindrome();
            System.out.println("Number is palindrome: " + palindrome.isPalindrome(palindromeNr));
        }

        //       5. Display all the prime numbers lower than a given number
        if(choseOperation == 5 || choseOperation == 6)
        {
            System.out.println("Please insert the max number");
            int primeNr =  Integer.parseInt(scanner.nextLine());
            PrimeNumbers primeNumbers = new PrimeNumbers();
            System.out.println("This are the prime numbers smaller than " + primeNr);
            primeNumbers.primeNumbers(primeNr);
        }
    }
}
