package caelum.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BikeDatabase {
    public static ArrayList<Boolean> availableBikes;
    static {
        availableBikes = new ArrayList<>();
        for (int i = 0; i < 15; i++){
            availableBikes.add(true);
        }
    }
    static void addBike(){
        for (int i = 0; i < availableBikes.size(); i++) {
            boolean bike = availableBikes.get(i);
            if(!bike){
                availableBikes.set(i, true);
                return;
            }
        }
        //No free bike slot?
        //...no case specified, just pop that bike down on the ground.
        availableBikes.add(true);
    }
}
