import java.io.FileNotFoundException;
public class Main 
 {
    public static void main(String[] args) throws FileNotFoundException {

        Account a = new Account("Luis-Cruz");
        System.out.println(a.getUsername());

        a = new Account("PSmith");
        System.out.println(a.getUsername());

        a = new Account("Amy-Marie-Lin");
        System.out.println(a.getShortenedName());

        a = new Account("Rachel-Zheng");
        System.out.println(a.getShortenedName());

    }

}