package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        first = (first > 0) ? first : -first;
        second = (second > 0) ? second : -second;

        while (first != second) {
            if (first > second) {
                first = first - second;
            } else {
                second = second - first;
            }
        }
        System.out.println(first);
    }
}
