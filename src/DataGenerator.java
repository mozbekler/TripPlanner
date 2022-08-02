import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class DataGenerator {

    public static List<DayOfWeek> schedule(){
        Random random = new Random();

        List<DayOfWeek> schedule = new ArrayList<>();
        schedule.add(DayOfWeek.of(1+random.nextInt(7)));
        schedule.add(DayOfWeek.of(1+random.nextInt(7)));
        schedule.add(DayOfWeek.of(1+random.nextInt(7)));
        schedule.add(DayOfWeek.of(1+random.nextInt(7)));
        schedule.add(DayOfWeek.of(1+random.nextInt(7)));
        schedule.add(DayOfWeek.of(1+random.nextInt(7)));
        schedule.add(DayOfWeek.of(1+random.nextInt(7)));
        return schedule;
    }


public static void createStudent(){


    Student student1 = new Student("Nathan",56,new ArrayList<>(Arrays.asList(DayOfWeek.of(1),DayOfWeek.of(4),DayOfWeek.of(5),DayOfWeek.of(6))));
    Student student2 =new Student("Maria",23,new ArrayList<>(Arrays.asList(DayOfWeek.of(2),DayOfWeek.of(3),DayOfWeek.of(4),DayOfWeek.of(5),DayOfWeek.of(6))));
    Student student3 =new Student("Mike",11.75,schedule());
    Student student4 =new Student("Natalie",0,schedule());
    Student student5 =new Student("Sergiy",0,schedule());
    Student student6 =new Student("Murtaza",0,schedule());
    Student student7 =new Student("Ekaterina",20,schedule());
    Student student8 =new Student("Yulia",103,schedule());
    Student student9 =new Student("Mehmet",54.50,schedule());
    Student student10 =new Student("Yusuf",42,schedule());
    Student student11 =new Student("Sumeye",99.75,schedule());
    Student student12 =new Student("Glenio",345,schedule());
    Student student13 =new Student("Sebastian",77,schedule());
    Student student14 =new Student("Nina",56.50,schedule());


    StaticConstants.STUDENT_LIST.addAll(Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8,student9,student10,student11,student12,student13,student14));


}

    public static void createTeacher(){
    Teacher teacher1 = new Teacher("Ower",56,new ArrayList<>(Arrays.asList(DayOfWeek.of(1),DayOfWeek.of(4),DayOfWeek.of(5),DayOfWeek.of(6))),"Fraternity");
    Teacher teacher2 = new Teacher("Otto",23,new ArrayList<>(Arrays.asList(DayOfWeek.of(2),DayOfWeek.of(3),DayOfWeek.of(4),DayOfWeek.of(5),DayOfWeek.of(6))),"Travelers Digital");
    Teacher teacher3 = new Teacher("Matt",11.75,schedule(),"Travelers");
    Teacher teacher4 = new Teacher("Musti",0,schedule(),"Digitals");
    Teacher teacher5 = new Teacher("John",0,schedule(),"Fraternity Travelers");

    StaticConstants.TEACHER_LIST.addAll(Arrays.asList(teacher1,teacher2,teacher3,teacher4,teacher5));
    }

    public static void createCity(){

    int[] losAngelesLocation={0,0};
    City losAngeles = new City("Los Angeles", losAngelesLocation);

    int[] washingtonLocation ={1,9};
    City washington = new City("Washington", washingtonLocation);

    int[] lasVegasLocation = {2,2};
    City lasVegas = new City("Las Vegas", lasVegasLocation);

    int[] denverLocation = {5,4};
    City denver = new City("Denver", denverLocation);

    int [] minneapolisLocation = {6,7};
    City minneapolis = new City("Minneapolis", minneapolisLocation);

    int[] dallasLocation = {8,2};
    City dallas = new City("Dallas", dallasLocation);

    int[] chicagoLocation= {9,7};
    City chicago= new City("Chicago",chicagoLocation);

    int[] nashvilleLocation ={11,3};
    City nashville = new City("Nashville", nashvilleLocation);

    int[] newYorkLocation = {13,7};
    City newYork = new City("New York", newYorkLocation);

    int[] vermontLocation = {14,9};
    City vermont = new City("Vermont", vermontLocation);

    StaticConstants.CITY_LIST.addAll(Arrays.asList(losAngeles,washington,lasVegas,denver,minneapolis,dallas,chicago,nashville,newYork,vermont));

    }

    public static void createDriver(){

    Driver driver1 = new Driver("Bruce Wills",schedule());

    StaticConstants.DRIVER_LIST.add(driver1);


    }


    public static void daysOfWeek(){
    StaticConstants.DAY_OF_WEEKS.addAll(Arrays.asList(DayOfWeek.of(1),DayOfWeek.of(2),DayOfWeek.of(3),DayOfWeek.of(4),DayOfWeek.of(5),DayOfWeek.of(6),DayOfWeek.of(7)));
    }






}
