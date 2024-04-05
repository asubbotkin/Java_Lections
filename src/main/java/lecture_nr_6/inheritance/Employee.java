package lecture_nr_6.inheritance;

public class Employee extends Human{
    int yearsOfExp;

    public Employee(String name, String surname, int age, int yearsOfExp) {
        super(name, surname, age);
        this.yearsOfExp = yearsOfExp;
    }
}
