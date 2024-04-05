package lecture_nr_6.inheritance;

public class Main {
    public static void main(String[] args) {

//        Human human = new Human();

        Child child = new Child("Vova", "Subbotkin", 8, "Tom&Jerry");
        Retiree retiree = new Retiree("Vasea", "Ivanov", 66, "Golf");
        Employee employee = new Employee("Alex", "Alexandrov", 40,  10);

        Developer developer = new Developer("Mihail", "Ivanov", 30, 5, "Java");
        Accountant accountant = new Accountant("Vasea", "Pupkin",25, 13, "Trading");

    }
}
