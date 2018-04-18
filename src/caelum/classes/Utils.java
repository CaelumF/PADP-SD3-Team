package caelum.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {
    public static Scanner globScanner;

    static {
        try {
            globScanner = new Scanner(new File("test2.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
