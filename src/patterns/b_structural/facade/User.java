package patterns.b_structural.facade;

import patterns.b_structural.facade.example1.hidden_bussines_logic.SystemControlFacade;
import patterns.b_structural.facade.example2.Waiter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {

    public static void main(String[] args) {

        SystemControlFacade systemControl = new SystemControlFacade();
        systemControl.lockHome();
        System.out.println("--------------");
        systemControl.unlockHome();
        System.out.println("--------------");
        systemControl.lightOn();
        System.out.println("--------------");
        systemControl.lightOff();

        Waiter waiter = new Waiter();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("------------MENU-------------");
            System.out.println("Pick menu: ");
            waiter.getAvailableMenus();
            System.out.println("3. Bill please");
            try {
                int menu = scanner.nextInt();
                if (menu == 1) {
                    waiter.getMeatMenu();
                } else if (menu == 2) {
                    waiter.getVegeMenu();
                } else if (menu == 3) {
                    waiter.bill();
                    return;
                } else {
                    System.out.println("Wrong choice! Try again.");
                    continue;
                }
                System.out.println("Order - write number: ");
                int order = scanner.nextInt();
                if (order > 0 && order < 4) {
                    System.out.println("Please wait.");
                    waiter.takeOrder(order, menu);
                    Thread.sleep(2000);
                    waiter.getOrder();
                    Thread.sleep(5000);
                    System.out.println("Waiter: order/bill");
                    scanner.nextLine();
                    String command = scanner.nextLine();
                    if (waiter.billPlease(command)) {
                        waiter.bill();
                        return;
                    }
                } else {
                    System.out.println("There is no such dish in our menu!");
                }
            } catch (InputMismatchException | InterruptedException e) {
                System.out.println("Wrong choice! Try again.");
            }
        }

    }
}
