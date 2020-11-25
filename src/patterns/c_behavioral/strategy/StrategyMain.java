package patterns.c_behavioral.strategy;

import java.util.Scanner;

public class StrategyMain {

    public static void main(String[] args) {

        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Write first number: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Write second number: ");
                int b = Integer.parseInt(scanner.nextLine());
                boolean pickedCorrect = false;
                do {
                    System.out.println("Pick number of operation: \n1. add\n2. subtract\n3. multiply\n4. divide");
                    String operationNumber = scanner.nextLine();
                    switch (operationNumber) {
                        case "1":
                            context.setMathematicalOperation(new AddOperation());
                            break;
                        case "2":
                            context.setMathematicalOperation(new SubtractOperation());
                            break;
                        case "3":
                            context.setMathematicalOperation(new MultiplyOperation());
                            break;
                        case "4":
                            context.setMathematicalOperation(new DivideOperation());
                            break;
                        default:
                            System.out.println("Wrong input, must be a number!");
                            break;
                    }
                    if (context.getStrategy() != null) {
                        pickedCorrect = true;
                    }
                } while (!pickedCorrect);
                System.out.print("Result of " + context.getStrategy().getClass().getSimpleName() + " is: ");
                context.executeMathematicalOperation(a, b);
                return;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input, must be a number!");
            }
        }
    }


}
