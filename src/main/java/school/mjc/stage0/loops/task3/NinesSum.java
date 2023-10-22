package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int number = 0;

        for (int i = 0; i < lengthOfLastNumber; i++) {
            number = number * 10 + 9;
        }

        for (int i = 9; i <= number; i = i * 10 + 9) {
            sum += i;
        }

        System.out.println(sum);
    }
}
