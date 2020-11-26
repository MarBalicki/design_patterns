package patterns.c_behavioral.strategy;

import patterns.c_behavioral.strategy.example1.Context;
import patterns.c_behavioral.strategy.example1.User;
import patterns.c_behavioral.strategy.example2.Device;
import patterns.c_behavioral.strategy.example2.NavigationContext;

import java.awt.*;
import java.util.Scanner;

public class StrategyMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("--------EXAMPLE 1-------");
//        NavigationContext navigationContext = new NavigationContext();
//        while (true) {
//            try {
//                System.out.println("Write start point num/num: ");
//                String startPoint = scanner.nextLine();
//                String[] startPointXY = startPoint.split("/");
//                Point start = new Point(Integer.parseInt(startPointXY[0]), Integer.parseInt(startPointXY[1]));
//                System.out.println("Write end point num/num: ");
//                String endPoint = scanner.nextLine();
//                String[] endPointXY = endPoint.split("/");
//                Point end = new Point(Integer.parseInt(endPointXY[0]), Integer.parseInt(endPointXY[1]));
//                Device.getTravelWay(navigationContext, scanner);
//                navigationContext.deviceNavigate(start, end);
//                return;
//            } catch (NumberFormatException e) {
//                System.out.println("Wrong input, must be a number!");
//            }
//        }

        System.out.println("--------EXAMPLE 2-------");
        while (true) {
            try {
                Context context = new Context();
                System.out.println("Write first number: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Write second number: ");
                int b = Integer.parseInt(scanner.nextLine());
                User.strategy(context, scanner);
                System.out.print("Result of " + context.getStrategy().getClass().getSimpleName() + " is: ");
                context.executeMathematicalOperation(a, b);
                return;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input, must be a number!");
            }
        }


    }
}
