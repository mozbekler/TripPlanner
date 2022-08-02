import java.time.DayOfWeek;
import java.util.List;

public class Teacher {

    private String name;
    private double budget;
    private List<DayOfWeek> availableDaysOfWeek;
    private String clubName;

    public Teacher(String name, double budget, List<DayOfWeek> availableDayOfWeeks, String clubName) {
        this.name = name;
        this.budget = budget;
        this.availableDaysOfWeek = availableDayOfWeeks;
        this.clubName = clubName;
    }


    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public List<DayOfWeek> getAvailableDaydOfWeek() {
        return availableDaysOfWeek;
    }

    public String getClubName() {
        return clubName;
    }
}
