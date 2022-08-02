import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        DataGenerator.createStudent();
        DataGenerator.createCity();
        DataGenerator.createTeacher();
        DataGenerator.createDriver();

        System.out.println("University of California students and teachers are searching for a trip");
        System.out.println("************************************************************************");



        for (City city : StaticConstants.CITY_LIST) {
            if (!city.getName().equals("Los Angeles")){
                System.out.println(city.getName());
            }
        }

        System.out.println("Please enter the name of the target city");
        Scanner scanner =new Scanner(System.in);

        String targetCity = scanner.next();
        int count=0;
        for (City city : StaticConstants.CITY_LIST) {

            if (city.getName().equalsIgnoreCase(targetCity)){
                count++;
            }
        }
        if (count!=1){
            throw new Exception("There is no such a city: "+targetCity);
        }

        System.out.println("Select the day of the trip");

        for (int i = 1; i <=7 ; i++) {
            System.out.println("Enter "+i+" for: "+DayOfWeek.of(i));
        }

        DayOfWeek selectedDay= DayOfWeek.of(scanner.nextInt());

        List<Driver> availableDrivers = new ArrayList<>();
        List<Teacher> availableTeachers = new ArrayList<>();
        List<Student> availableStudents = new ArrayList<>();
        System.out.println("************************************************************************");
        System.out.println("Available Drivers: ");

        for (Driver driver : StaticConstants.DRIVER_LIST) {
           if (driver.getAvailableDayOfWeeks().contains(selectedDay)){
               availableDrivers.add(driver);
           }
        }

        if (availableDrivers.size()==0){
            System.out.println("There is no available driver on "+selectedDay +"\nTrip should be postponed. Sorry :(");
            System.exit(0);
        }else{
            for (Driver each : availableDrivers) {
                System.out.println(each.getName()+" is available on "+selectedDay);

            }
            System.out.println("************************************************************************");
            }

        System.out.println("Available Teachers: ");

        for (Teacher teacher : StaticConstants.TEACHER_LIST) {
            if (teacher.getAvailableDaydOfWeek().contains(selectedDay) && teacher.getClubName().contains("Traveler") && teacher.getBudget()>0){
                availableTeachers.add(teacher);
            }
        }

        if (availableTeachers.size()==0){
            System.out.println("There is no available teacher who is a \"Travelers\" club member on "+selectedDay +"\nTrip should be postponed. Sorry :(");
            System.exit(0);
        }else{
            for (Teacher each : availableTeachers) {
                System.out.println(each.getName()+" is available on "+ selectedDay+ ". His/her budget is "+each.getBudget());
            }
            System.out.println("************************************************************************");
        }
        System.out.println("Available Students: ");

        for (Student student : StaticConstants.STUDENT_LIST) {
            if (student.getAvailableDaysOfWeek().contains(selectedDay) && student.getBudget()>0){
                availableStudents.add(student);
            }
        }

        for (Student each : availableStudents) {
            System.out.println(each.getName()+" is available on "+ selectedDay+ ". His/her budget is "+each.getBudget());
        }
        System.out.println("************************************************************************");


        System.out.println("Total Budget: "+totalBudget(availableTeachers,availableStudents));

        System.out.println("Total Gasoline Expense: "+totalGasolineExpense(targetCity));

        if (totalBudget(availableTeachers,availableStudents)>=totalGasolineExpense(targetCity)){
            System.out.println("Congrats. You can do "+ targetCity+ " trip.");
            System.out.println("Your new balance after decresing the gasoline expense is "+(totalBudget(availableTeachers,availableStudents)-totalGasolineExpense(targetCity)));
        }else{
            System.out.println("So sorry. You can not do "+ targetCity+ " trip");
            System.out.println("You need "+(totalBudget(availableTeachers,availableStudents)-totalGasolineExpense(targetCity)));
        }





        }

    private static double totalBudget(List<Teacher> availableTeachers, List<Student> availableStudents) {
        double totalBudget=0;

        for (Teacher each : availableTeachers) {
            totalBudget+=each.getBudget();
        }

        for (Student each : availableStudents) {
            totalBudget+=each.getBudget();
        }


        return totalBudget;
    }

    private static double totalGasolineExpense(String targetCity) {
        double totalGasExpense=0;
        for (City city : StaticConstants.CITY_LIST) {
            if (city.getName().equalsIgnoreCase(targetCity)){
                int x=city.getCoordinates()[0];
                int y= city.getCoordinates()[1];
               totalGasExpense=(x+y)*250*0.2;

            }
        }
        return totalGasExpense;
    }


}





