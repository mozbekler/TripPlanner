import java.time.DayOfWeek;
import java.util.List;

public class Student {

    private String name;
    private double budget;
    private List<DayOfWeek> availableDaysOfWeek;

    public Student(String name, double budget, List<DayOfWeek> availableDayOfWeeks) {
        this.name = name;
        this.budget = budget;
        this.availableDaysOfWeek = availableDayOfWeeks;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public List<DayOfWeek> getAvailableDaysOfWeek() {
        return availableDaysOfWeek;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", availableDayOfWeeks=" + availableDaysOfWeek +
                '}';
    }
}
