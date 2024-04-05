package lecture_nr_4;

public class lecture_nr_4 {
    public static void main(String[] args) {
        test();

//        int result = multiply();
//        System.out.println(result);

        System.out.println("The result of multiplication is: " + multiply(3, 3));
        System.out.println("The result of multiplication is: " + multiply(4, 5));
        System.out.println("The result of multiplication is: " + multiply(2, 2));
        System.out.println("The result of multiplication is: " + multiply(7, 8));
        System.out.println("The result of multiplication is: " + multiply(3, 6));
        System.out.println();
        System.out.println("The result of division is: " + divide(4, 2));
        System.out.println("The result of division is: " + divide(6, 3));
        System.out.println("The result of division is: " + divide(18, 3));
        System.out.println("The result of division is: " + divide(60, 6));

        Car car1 = new Car("BMW", "M4", 2, 450);
        Car car2 = new Car("Subaru", "BRZ", 2, 250, false);

//        car1.manufacturer = "BMW";
//        car1.model = "M4";
//        car1.nrOfDoors = 2;
//        car1.hp = 450;
//        car1.isAWD = false;
        System.out.println(car1.manufacturer);
        System.out.println(car1.model);
        System.out.println(car2.manufacturer);
        System.out.println(car2.model);
        System.out.println();

        printCarInformation(car1);

    }
    static void printCarInformation(Car car){
        System.out.println("Car manufacturer: " + car.manufacturer
                + " Car model: " + car.model
                + " Car nrOfDoors: " + car.nrOfDoors
                + " Car hp: " + car.hp
                + " Is AWD?: " + car.isAWD
        );
    }

//    static  int multiply(){
//        return 3 * 2;
//    }
    static  int multiply(int x, int y){
        int result;
        result = x * y;
        return result;
    }
    static int divide(int x, int y){
        if(y == 0) {
//            return ;
            return x / y;
        }
        return 0;
    }

    static void test(){
        System.out.println("Hello World!");
    }
}
