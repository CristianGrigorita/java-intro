package operations;

/**
 * 4. Check if a number is palindrom( e.g palindrom 1221, 34143)
 */
public class Palindrome {
    public boolean isPalindrome(int number){
        int reverse = 0;
        int palindromeNr = number;

        while(palindromeNr != 0) {
            int remainder = palindromeNr % 10;
            reverse = reverse * 10 + remainder;
            palindromeNr = palindromeNr / 10;
        }

        return reverse == number;
    }
}
