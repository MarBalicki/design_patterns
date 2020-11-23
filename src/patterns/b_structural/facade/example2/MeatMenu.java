package patterns.b_structural.facade.example2;

import java.util.ArrayList;
import java.util.List;

class MeatMenu implements Menu {

    @Override
    public List<String> getMenu() {
        List<String> menu = new ArrayList<>();
        String spagetti = "1. Spagetti bolonese";
        String meatBalls = "2. Meat balls";
        String pork = "3. Pork shnitzel";
        menu.add(spagetti);
        menu.add(meatBalls);
        menu.add(pork);
        return menu;
    }
}
