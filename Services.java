import java.util.*;

public class Services {
    Scanner sc = new Scanner(System.in);

    void addContact() {

        Contacts obj = new Contacts();

        System.out.println("Enter First Name: ");
        String x = sc.nextLine();
        obj.setFirstName(x);

        System.out.println("Enter Last Name: ");
        x = sc.nextLine();
        obj.setLastName(x);

        System.out.println("Enter Home Address: ");
        x = sc.nextLine();
        obj.setHomeAddress(x);

        System.out.println("Enter City Name: ");
        x = sc.nextLine();
        obj.setCity(x);

        System.out.println("Enter State Name: ");
        x = sc.nextLine();
        obj.setState(x);

        System.out.println("Enter Phone Number: ");
        x = sc.nextLine();
        obj.setPhoneNumber(x);

        System.out.println("Enter Email Address: ");
        x = sc.nextLine();
        obj.setPhoneNumber(x);

    }

}
