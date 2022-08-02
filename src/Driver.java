import java.time.DayOfWeek;
import java.util.List;

public class Driver {


    private String name;
    private List<DayOfWeek> availableDaysOfWeek;

    public Driver(String name, List<DayOfWeek> availableDayOfWeeks) {
        this.name = name;
        this.availableDaysOfWeek = availableDayOfWeeks;
    }

    public String getName() {
        return name;
    }

    public List<DayOfWeek> getAvailableDayOfWeeks() {
        return availableDaysOfWeek;
    }
}
