package operations;

/**
 * 3. Display the max digit from a number.
 */
public class MaxDigit {
    public int findMaxDigit(int number)
    {
        int maxDigit = 0;

        if(number > 0){

            while (number > 0) {
                // get the last digit in the number, it will always be the rest of the modulo
                int digit = number % 10;

                maxDigit = Math.max(digit, maxDigit);

                // divide by 10, this way the last digit form the number will be removed from number.
                // ex: 2345 / 10 = 234.5, as .5 is not an int, it will be removed. number remaining: 234.
                number /= 10;
            }
        }

        return maxDigit;
    }
}
