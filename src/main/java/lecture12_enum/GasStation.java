package lecture12_enum;

import java.util.List;

public class GasStation {
    public String adress;
    public int id;
    public final List<FuelType> fuelTypes;

    public GasStation(String adress, int id, List<FuelType> fuelTypes) {
        this.adress = adress;
        this.id = id;
        this.fuelTypes = fuelTypes;
    }


}

