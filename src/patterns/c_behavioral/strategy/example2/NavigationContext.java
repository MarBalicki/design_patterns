package patterns.c_behavioral.strategy.example2;

import java.awt.*;

public class NavigationContext {

    private Navigation navigation;

    public Navigation getNavigation() {
        return navigation;
    }

    public void setTravelWay(Navigation navigation) {
        this.navigation = navigation;
    }

    public void deviceNavigate(Point start, Point end) {
        navigation.navigate(start, end);
    }
}
