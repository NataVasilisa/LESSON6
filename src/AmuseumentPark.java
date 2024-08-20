import java.util.Arrays;

public class AmuseumentPark {
    public AmuseumentPark() {
        this.attractions = new Attraction[0];
    }
    public Attraction[] getAttractions() {
        return attractions;
    }

    public void setAttractions(Attraction[] attractions) {
        this.attractions = attractions;
    }
    public void addAttraction(Attraction attraction) {
        this.attractions = Arrays.copyOf(this.attractions, this.attractions.length + 1);
        this.attractions[this.attractions.length - 1] = attraction;
    }
    private Attraction[] attractions;

    public static class Attraction {
        private String name;
        private String time;
        private double cost;
        public Attraction(String name, String time, double cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }
        public double getCost() {
            return cost;
        }
        public void setCost(double cost) {
            this.cost = cost;
        }
        @Override
        public String toString() {
            return String.format("Название: %s \tВремя работы: %s \tЦена: %f \n",
                    name, time, cost);
        }
    }
    @Override
    public String toString() {
        String[] attractions = new String[this.attractions.length];
        for (int i = 0; i < attractions.length; i++) {
            attractions[i] = this.attractions[i].toString();
        }
        return String.join("\n", attractions);
    }
}
