import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        toTerminal("Enter number: ", PrintType.IN_LINE);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //Test case num 1
        toTerminal("Answer of function num 1: " + Calc.firstCalculation(n));
        toTerminal("Count of iteration: " + Calc.countOfIteration);

        //Test case num 2
        toTerminal("Answer of function num 2: " + Calc.secondCalculation(n));
        toTerminal("Count of iteration: " + Calc.countOfIteration);

        //Test case num 3
        toTerminal("Answer of function num 3: " + Calc.thirdCalculation(n));
        toTerminal("Count of iteration: " + Calc.countOfIteration);
    }

    public static void toTerminal(String str) {
        System.out.println(str);
    }

    public static void toTerminal(String str, PrintType type) {
        System.out.print(str + type.toString());
    }
}

enum PrintType {
    NEXT_LINE("\n"),
    IN_LINE("");

    private final String type;

    private PrintType(String s) {
        type = s;
    }

    public String toString() {
        return this.type;
    }
}
