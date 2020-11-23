package patterns.b_structural.facade.example2;

import java.util.ArrayList;
import java.util.List;

class Order {
    private final List<String> orderList;

    public Order() {
        this.orderList = new ArrayList<>();
    }

    List<String> getOrderList() {
        return orderList;
    }

}
