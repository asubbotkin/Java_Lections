package bryus_ekkel.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gerbil gerbil1 = new Gerbil(8);
        Gerbil gerbil2 = new Gerbil(6);
        Gerbil gerbil3 = new Gerbil(1);
        Gerbil gerbil4 = new Gerbil(16);

        ArrayList<Gerbil> gerbilsList = new ArrayList<>(Arrays.asList(
                gerbil1, gerbil2, gerbil3, gerbil4));
        for(Gerbil gerbil: gerbilsList)
            gerbil.hop();

        List<Integer> intList = Arrays.asList(12, 34, 45, 67);

//        intList.add(67);
        }
    }

