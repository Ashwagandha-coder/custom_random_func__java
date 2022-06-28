import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Random_Function {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);
        printStream.println("Введите диапазон min max через пробел");

        System.out.println(new Random_Function().rnd(scanner.nextInt(), scanner.nextInt()));
    }

    public int rnd(int min, int max) {

        max -= min;

        return (int) (Math.random() * ++max) + min;


    }
}