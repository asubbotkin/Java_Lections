package lecture_nr_6.inheritance;

public class Accountant extends Employee{
    String spetialization;

    public Accountant(String name, String surname, int age, int yearsOfExp, String spetialization) {
        super(name, surname, age, yearsOfExp);
        this.spetialization = spetialization;
    }
}
