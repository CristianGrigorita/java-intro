package operations;

/**
 * 5. Display all the prime numbers lower than a given number
 */
public class PrimeNumbers {
    public void primeNumbers(int maxNumber) {
        int nr = 21;
//        System.out.println(nr);
        StringBuilder primeNumbers = new StringBuilder();

        for (int num = 0; num < maxNumber; num++){
            int divCounter = 0;
            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    divCounter++;
                }
            }
            if(divCounter == 2) {
                primeNumbers.append(num).append(" ");
            }
        }
        System.out.println(primeNumbers);
    }
}
