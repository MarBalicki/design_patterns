package patterns.b_structural.facade.example2;

import java.util.List;
import java.util.Random;

class Bill {

    void getBill(Order order) {
        Random random = new Random();
        List<String> orderList = order.getOrderList();
        double totalBill = 0;
        for (String orderedPosition : orderList) {
            double positionPrice = Double.parseDouble(random.nextInt(100)
                    + "." + random.nextInt(99));
            System.out.println(orderedPosition + ": " + positionPrice + " PLN");
            totalBill += positionPrice;
        }
        System.out.printf("Total: %.2f PLN", totalBill);
    }
}
