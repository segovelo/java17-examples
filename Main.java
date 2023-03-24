
import java.util.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
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

    List<String> myList = Arrays.asList(new String[]{"dog", "cat", "rabbit"});
    boolean isThereAmouse =  myList.stream().anyMatch((var pet) -> "mouse".equals(pet));
    if(isThereAmouse){
        System.out.println("There is a mouse in the list");
    } else System.out.println("There is NOT a mouse in the list");

    DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
    boolean freeDay = switch (dayOfWeek) {
    	case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> false;
    	case SATURDAY, SUNDAY -> true;
    };
    System.out.println("Today is " + dayOfWeek);
    if(freeDay){
        System.out.println("It is a free Day ");
    } else System.out.println("It is NOT a free day");

    record BankAccount (String bankName, String accountNumber) {};
    
}
}