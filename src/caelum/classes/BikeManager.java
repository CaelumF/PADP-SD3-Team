package caelum.classes;

import stephen.classes.Payment;

import java.util.ArrayList;

public class BikeManager {
    public static ArrayList<Boolean> availableBikes;
    static {
        availableBikes = new ArrayList<>();
        for (int i = 0; i < 15; i++){
            availableBikes.add(true);
        }
    }
    public static void rentBike(String renterEmail, int bikeNumber){
        BikeManager.availableBikes.set(bikeNumber, false);
        BikeTimer.getInstance().startRenting(renterEmail);
    }
    public static void returnBike(String returnerEmail){
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
        Payment.chargeHire(BikeTimer.getInstance().getTime(returnerEmail));
    }
}
