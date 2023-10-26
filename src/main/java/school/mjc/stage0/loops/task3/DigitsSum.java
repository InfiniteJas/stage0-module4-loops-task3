package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int sum = 0;
        String numberAsString = number + ""; // Convert the number to a string using concatenation

        int length = numberAsString.length();

        for (int i = 0; i < length; i++) {
            char digitChar = numberAsString.charAt(i);
            int digit = digitChar - '0'; // Convert char to int without using Character.getNumericValue()
            sum += digit;
        }

        System.out.println(sum);
    }
}

