import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Account {
    private String username;

public class Account {
    private String username;

public Account(String requestedName) throws FileNotFoundException {
        int num = 1;
        String possibleName = requestedName;

        while (!isAvailable(possibleName)) {
            possibleName = requestedName + num;
            num++;
        }

        username = possibleName;
    }


public static boolean isAvailable(String str) throws FileNotFoundException {
    File f = new File("usernames.txt");
    java.util.Scanner s = new Scanner(f);
    while (s.hasNextLine()) {
        if (s.nextLine().equals(str))
            return false;
    }
    return true;
}

public Account(String requestedName) throws FileNotFoundException {
   int num = 1;
   String possibleName = requestedName;
   while (!isAvailable(possibleName)) {
         possibleName = requestedName + num;
          num++;
          username = possibleName;
   }
}

public String getShortenedName() {
    String shortenedName = username;
    int hyphen= shortenedName.indexOf("-");
    while (hyphen > 0) {
        shortenedName = shortenedName.substring(0, hyphen -1) + shortenedName.substring(hyphen + 1);
    hyphen = shortName.indexOf("-");
        }

        return shortName;
}

a = new Account("Rachel-Zheng");
System.out.println(a.getUsername())

