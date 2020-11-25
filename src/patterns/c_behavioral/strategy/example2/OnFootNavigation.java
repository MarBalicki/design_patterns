package patterns.c_behavioral.strategy.example2;

import java.awt.*;

public class OnFootNavigation implements Navigation {

    private static final int AVERAGE_SPEED = 3; //km per hour

    @Override
    public void navigate(Point start, Point end) {
        double distance = Math.sqrt(Math.pow((end.x - start.x), 2) + Math.pow((end.y - start.y), 2));
        System.out.printf("Distance of '%.2f' km on foot You will gain in '%.2f' hours. Average speed taken: %d km/h\n"
                , distance, distance / AVERAGE_SPEED, AVERAGE_SPEED);
    }
}
