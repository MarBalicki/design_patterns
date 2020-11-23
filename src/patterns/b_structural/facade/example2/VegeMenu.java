package patterns.b_structural.facade.example2;

import java.util.ArrayList;
import java.util.List;

class VegeMenu implements Menu {

    @Override
    public List<String> getMenu() {
        List<String> menu = new ArrayList<>();
        String pasta = "1. pasta with pesto";
        String vegetables = "2. grilled vegetables";
        String soup = "3. pumpkin soup";
        menu.add(pasta);
        menu.add(vegetables);
        menu.add(soup);
        return menu;
    }
}
