import java.util.List;

public class City {

    private String name;
    private int[] coordinates =new int[2];

    public City(String name, int[] coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public int[] getCoordinates() {
        return coordinates;
    }
}
