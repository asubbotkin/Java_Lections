package lecture12_enum;

import java.util.List;

public class GasStation {
    public String address;
    public int id;
    public List<FuelType> fuelTypes;

    public GasStation(String address, int id, List<FuelType> fuelTypes) {
        this.address = address;
        this.id = id;
        this.fuelTypes = fuelTypes;
    }

    public void printFuelTypes(){
        for (FuelType fuel : fuelTypes) {
            System.out.println(fuel);
        }
    }
    public void gasStationInformation(){
        System.out.println("Gas station number" + id);
        System.out.println("Gas station address" + address);
    }

    public void addNewFuelType(FuelType fuelType){
        fuelTypes.add(fuelType);
    }

}

