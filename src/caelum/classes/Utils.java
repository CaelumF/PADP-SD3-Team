package caelum.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {
    public static Scanner globScanner;
    private final static boolean DEBUG_MODE_ENABLED = false;

    static {
        if (DEBUG_MODE_ENABLED) {
            try {
                globScanner = new Scanner(new File("test2.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            globScanner = new Scanner(System.in);
        }
    }
}
