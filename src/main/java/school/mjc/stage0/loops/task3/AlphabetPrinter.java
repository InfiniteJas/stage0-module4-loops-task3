package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char start = 'A';
        char end = 'Z';

        for (char letter = start; letter <= end; letter++) {
            System.out.println(letter + " ");
        }
    }
}
