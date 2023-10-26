package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstNumber = 0;
        int secondNumber = 1;

        System.out.println(firstNumber); // Print the first number of the series
        System.out.println(secondNumber); // Print the second number of the series

        for (int i = 2; i < lastFibonacci; i++) {
            int nextNumber = firstNumber + secondNumber;
            System.out.println(nextNumber);
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
