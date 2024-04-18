package lecture12_enum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    GasStation bemol1 = new GasStation("str. Pushkin 2", 127656, new ArrayList<>(Arrays.asList(
            FuelType.PETROL_95, FuelType.PETROL_98, FuelType.PETROL_100, FuelType.DIESEL_51)));
    GasStation bemol2 = new GasStation("str. Zaikin 2", 907234, new ArrayList<>(Arrays.asList(
            FuelType.PETROL_95, FuelType.DIESEL_51
    )));

        System.out.println(bemol1.fuelTypes);

        System.out.println(FuelType.valueOf("PETROL_95"));

        // Варианты вывода всех элементов enum
        String fuelTypes = Arrays.toString(FuelType.values());
        System.out.println(fuelTypes);


        FuelType[] fuelTypes1 = FuelType.values();
        for(int i = 0; i < fuelTypes1.length; i++){
            System.out.println(fuelTypes1[i]);
        }

        System.out.println("---------------------------------");
        bemol1.printFuelTypes();
        bemol2.gasStationInformation();

        GasStation[] bemolGasStations = new GasStation[]{
                bemol1, bemol2
        };

        Bemol bemol = new Bemol(Arrays.asList(bemol1,bemol2));

        // Need to print fuel types of every gas station
        bemol.activeGasStations.stream()
            .forEach((e) -> {
                e.printFuelTypes();
            });
        // Need to add fuel type to every gas station
        bemol.activeGasStations.stream()
                .forEach((e) -> {
                    e.addNewFuelType(FuelType.ELECTRIC);
                });
        System.out.println("------------------------------");
        bemol.printAllGasStationsFuel();
    }
}
