package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int sum = 0;
        String numberAsString = Math.abs(number) + ""; // Convert the absolute value of the number to a string

        int length = numberAsString.length();

        for (int i = 0; i < length; i++) {
            char digitChar = numberAsString.charAt(i);
            int digit = digitChar - '0';
            sum += digit;
        }

        System.out.println(sum);
    }
}

