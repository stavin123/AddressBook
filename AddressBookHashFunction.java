import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;



public class AddressBookHashFunction {
    HashMap<Integer,Person> contactList = new HashMap<>();
    List<Integer> n1 = new ArrayList<>();

    public void editContactByName(AddressBookService address) throws CustomException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name of the person you want to edit:");
        String name = sc.next();

        for (Person person : contactList.values()) {
            if (person.getFirstName().equalsIgnoreCase(name)) {
                // person found, edit details using AddressBookService
                address.setValues(person);
                System.out.println("Contact details updated successfully.");
                return;
                // exit the method after updating
            }
        }

        // if person name not found
        System.out.println("Person with the given name not found in the address book.");
    }

    public void deletePersonByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name of the person you want to delete:");
        String name = sc.next();

        for (Person person : contactList.values()) {
            if (person.getFirstName().equalsIgnoreCase(name)) {
                // person found, delete from the address book
                contactList.values().remove(person);
                System.out.println("Contact deleted successfully.");
                return;
            }
        }

        // if person name not found
        System.out.println("Person with the given name not found in the address book.");
    }

}
