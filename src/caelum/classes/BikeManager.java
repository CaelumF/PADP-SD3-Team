package caelum.classes;

import luke.classes.Receipt;
import stephen.classes.Payment;

import java.util.ArrayList;

/**
 * @author caelum
 */
public class BikeManager {
    public static StringBuilder faults = new StringBuilder();
    public static ArrayList<Boolean> availableBikes;

    static {
        availableBikes = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            availableBikes.add(true);
        }
    }

    public static void rentBike(String renterEmail, int bikeNumber) {
        BikeManager.availableBikes.set(bikeNumber, false);
        BikeTimer.getInstance().startRenting(renterEmail);
    }

    public static void returnBike(String returnerEmail) {
        for (int i = 0; i < availableBikes.size(); i++) {
            boolean bike = availableBikes.get(i);
            if (!bike) {
                availableBikes.set(i, true);
                return;
            }
        }
        //No free bike slot?
        //...no case specified, just pop that bike down on the ground.
        availableBikes.add(true);
        Payment.chargeHire(BikeTimer.getInstance().getTime(returnerEmail));
    }

    public static void appendFault() {
        String bikeName = new UserQuery<String>("Which number bike did you pick?").
                query(s -> s.matches("[0-9]+"), s -> "Invalid bike number");
        String descriptoin = new UserQuery<String>("Describe the fault you have noticed").
                query(s -> true, s -> "");
        faults.append(bikeName);
    }
}
