package operations;

/**
 * 1. Calculate the sum of the first 100 numbers higher than 0
 */
public class OneHundredSum {

    public int Sum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i;
        };

        return sum;
    }
}
