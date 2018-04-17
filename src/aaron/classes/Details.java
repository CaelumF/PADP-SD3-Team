package aaron.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class Details {
    static /* This is how to declare HashMap */
            HashMap<String, String> users = new HashMap<>();
    /*Adding elements to HashMap*/
    public static void registerUser(String email, String pin) {
        users.put(email, pin);
    }
}