package lecture12_enum;

import java.util.List;

public class Bemol {
    public static int nrOfGasStations;
    public List<GasStation> activeGasStations;

    public Bemol(List<GasStation> activeGasStations) {
        this.activeGasStations = activeGasStations;
        nrOfGasStations = activeGasStations.size();
    }

    public void printAllGasStationsFuel(){
        activeGasStations.stream()
                .forEach((e) -> System.out.println(e.fuelTypes));
    }
}
