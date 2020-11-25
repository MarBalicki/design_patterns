package patterns.b_structural.facade.example2;

import java.util.Collections;

public class Waiter {
    private final MeatMenu meatMenu;
    private final VegeMenu vegeMenu;
    private final Order order;
    private final Bill bill;

    public Waiter() {
        this.meatMenu = new MeatMenu();
        this.vegeMenu = new VegeMenu();
        this.order = new Order();
        this.bill = new Bill();
    }

    public void getMeatMenu() {
        System.out.println(Collections.singletonList(meatMenu.getMenu()));
    }

    public void getVegeMenu() {
        System.out.println(Collections.singletonList(vegeMenu.getMenu()));
    }

    public void getAvailableMenus() {
        System.out.println("1. " + meatMenu.getClass().getSimpleName());
        System.out.println("2. " + vegeMenu.getClass().getSimpleName());
    }

    public void getOrder() {
        System.out.println("Your order: "
                + order.getOrderList().get(order.getOrderList().size() - 1));
    }

    public void bill() {
        System.out.println("Your bill: ");
        bill.getBill(order);
        System.out.println("\n---------------------");
    }

    public void takeOrder(int clientOrder, int menu) {
        if (menu == 1) {
            order.getOrderList().add(meatMenu.getMenu().get(clientOrder - 1));
        } else if (menu == 2) {
            order.getOrderList().add(vegeMenu.getMenu().get(clientOrder - 1));
        }
    }

    public boolean billPlease(String command) {
        return command.equals("bill");
    }
}
