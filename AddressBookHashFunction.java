import java.util.HashMap;
import java.util.Scanner;



public class AddressBookHashFunction {
    HashMap<Integer,Person> contactList = new HashMap<>();

    public void editContactByName(AddressBookService address) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name of the person you want to edit:");
        String name = sc.next();

        for (Person person : contactList.values()) {
            if (person.getFirstName().equalsIgnoreCase(name)) {
                // person found, edit details using AddressBookService
                address.setValues(person);
                System.out.println("Contact details updated successfully.");
                return; // exit the method after updating
            }
        }

        // if person name not found
        System.out.println("Person with the given name not found in the address book.");
    }
}
