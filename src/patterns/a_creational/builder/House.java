package patterns.a_creational.builder;

public class House {

    private final String walls;
    private final String doors;
    private final String windows;
    private final String roof;

    private final boolean withGarage;
    private final boolean withSwimmingPool;
    private final boolean withGarden;

    public String getWalls() {
        return walls;
    }

    public String getDoors() {
        return doors;
    }

    public String getWindows() {
        return windows;
    }

    public String getRoof() {
        return roof;
    }

    public boolean isWithGarage() {
        return withGarage;
    }

    public boolean isWithSwimmingPool() {
        return withSwimmingPool;
    }

    public boolean isWithGarden() {
        return withGarden;
    }

    private House(HouseBuilder builder) {
        this.walls = builder.walls;
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.roof = builder.roof;
        this.withGarage = builder.withGarage;
        this.withSwimmingPool = builder.withSwimmingPool;
        this.withGarden = builder.withGarden;
    }

    static class HouseBuilder {
        //basic elements
        private final String walls;
        private final String doors;
        private final String windows;
        private final String roof;

        //not included in builder constructor, so are optional
        private boolean withGarage;
        private boolean withSwimmingPool;
        private boolean withGarden;

        //every house have basic elements
        HouseBuilder(String walls, String doors, String windows, String roof) {
            this.walls = walls;
            this.doors = doors;
            this.windows = windows;
            this.roof = roof;
        }

        HouseBuilder withGarage(boolean withGarage) {
            this.withGarage = withGarage;
            return this;
        }

        HouseBuilder withSwimmingPool(boolean withSwimmingPool) {
            this.withSwimmingPool = withSwimmingPool;
            return this;
        }

        HouseBuilder withGarden(boolean withGarden) {
            this.withGarden = withGarden;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }
}
