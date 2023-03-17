
import java.util.*;
public class Main {

    public static void main(String[] args) {

String[] versionElements = System.getProperty("java.version").split("\\.");
    int discard = Integer.parseInt(versionElements[0]);
    int version;
    if (discard == 1) {
        version = Integer.parseInt(versionElements[1]);
    } else {
        version = discard;
    }

    System.out.println("Java version : " + version);
    
}