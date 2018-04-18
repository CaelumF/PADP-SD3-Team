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
     * Returns time in seconds
     * @param email
     * @return
     */
    public String getTime(String email){
        long rentMillis = System.currentTimeMillis() - rentMilliMap.getOrDefault(email, (long) 0);

    }
}
