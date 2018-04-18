package caelum.classes;

import java.util.HashMap;

public class BikeTimer {
    private static BikeTimer ourInstance = new BikeTimer();

    public static BikeTimer getInstance() {
        return ourInstance;
    }
    private HashMap<String, Long> rentMilliMap = new HashMap<>();
    private BikeTimer() {

    }

    public void startRenting(String email){
        rentMilliMap.put(email, System.currentTimeMillis());
    }

    /**
     * Returns time in minutes
     * @param email
     * @return Bike hire time in minutes
     */
    public int getTime(String email){
        long rentDurationMillis = System.currentTimeMillis() - rentMilliMap.getOrDefault(email, (long) 0);
        long seconds = rentDurationMillis / 1000;
        return (int) (rentDurationMillis / 60);
    }
}
