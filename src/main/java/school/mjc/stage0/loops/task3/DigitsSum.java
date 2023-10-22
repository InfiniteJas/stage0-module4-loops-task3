package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        String numberAsString = number + "";

        int length = numberAsString.length();

        for (int i = 0; i < length; i++) {
            char digitChar = numberAsString.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }

        System.out.println(sum);
    }
}
