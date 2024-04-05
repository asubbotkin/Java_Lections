package lecture_nr_4;

public class Car {
    String manufacturer;
    String model;
    int nrOfDoors;
    int hp;
    boolean isAWD;

    public Car(String manufacturer, String model, int nrOfDoors, int hp, boolean isAWD) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.nrOfDoors = nrOfDoors;
        this.hp = hp;
        this.isAWD = isAWD;
    }
    public Car(String manufacturer, String model, int nrOfDoors, int hp) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.nrOfDoors = nrOfDoors;
        this.hp = hp;
        this.isAWD = false;
    }

    public void drive() {
        System.out.println();
    }
}
