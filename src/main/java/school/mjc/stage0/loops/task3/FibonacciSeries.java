package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber;

        System.out.println(lastFibonacci);
        System.out.println(firstNumber); // Print the first number of the series

        for (int i = 1; i < lastFibonacci; i++) {
            System.out.println(secondNumber); // Print the second number of the series

            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
