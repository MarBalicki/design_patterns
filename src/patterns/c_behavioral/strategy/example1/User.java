package patterns.c_behavioral.strategy.example1;

import java.util.Scanner;

public class User {

    public static void strategy(Context context, Scanner scanner) {
        boolean pickedCorrect = false;
        do {
            System.out.println("Pick operation number: \n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
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
    }
}
