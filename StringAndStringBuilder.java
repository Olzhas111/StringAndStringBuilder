import java.util.Scanner;

public class StringAndStringBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = "hello";
        String word2 = "hello";
        String  word3 = scanner.next();

        System.out.println(word1 == word2); //true  - same memory link(string pool)
        System.out.println(word1 == word3); //even if we type "hello" false

        long startTime = System.nanoTime();
        String example = "Any word";
        for (int i = 0; i < 50000; i++) {
            example += i;
        }
        float workTime = System.nanoTime()-startTime;
        System.out.println("String work took " + workTime * 0.000001f + " miliseconds");
// now let us compare StringBuilder time to String

        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder("Example");
        for (int j = 0; j < 50000; j++) {
           stringBuilder.append(j);
        }
        workTime = System.nanoTime()-startTime;
        System.out.println("String work took " + workTime * 0.000001f + " miliseconds");



    }
}
