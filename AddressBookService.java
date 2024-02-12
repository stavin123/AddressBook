import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class AddressBookService {
    public String display(Person p){
        return p.getFirstName()+" "+p.getLastName()+" "+p.getCity()+" "+p.getState()+" "+ p.getEmail()+" "+p.getPhoneNumber()+ " "+p.getZip();
    }

    public void setValues(Person p) throws CustomException {
        Scanner sc = new Scanner(System.in);
        // Using Stream API for input processing
        Stream.of("First Name", "Last Name", "City", "State", "Email", "Phone Number", "Zip")
                .forEach(field -> {
                    System.out.println("Enter " + field);
                    switch (field) {
                        case "First Name" -> p.setFirstName(sc.next());
                        case "Last Name" -> p.setLastName(sc.next());
                        case "City" -> p.setCity(sc.next());
                        case "State" -> p.setState(sc.next());
                        case "Email" -> {
                            try {
                                p.setEmail(sc.next());
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }
                        case "Phone Number" -> {
                            try {
                                p.setPhoneNumber(sc.nextInt());
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }

                        case "Zip" -> p.setZip(sc.nextInt());
                    }
                });
    }
}


