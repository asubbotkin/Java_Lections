package lecture_nr_6.inheritance;

public class Developer extends Employee{
    String programmingLanguage;

    public Developer(String name, String surname, int age, int yearsOfExp, String programmingLanguage) {
        super(name, surname, age, yearsOfExp);
        this.programmingLanguage = programmingLanguage;
    }
}
