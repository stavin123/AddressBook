import java.util.Scanner;

public class AddressBookService {
    public String display(Person p){
        return p.getFirstName()+" "+p.getLastName()+" "+p.getCity()+" "+p.getState()+" "+ p.getEmail()+" "+p.getPhoneNumber()+ " "+p.getZip();
    }

    public void setValues(Person p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String fn = sc.next();
        p.setFirstName(fn);
        System.out.println("Enter last name");
        String ln = sc.next();
        p.setLastName(ln);
        System.out.println("Enter city");
        String city = sc.next();
        p.setCity(city);
        System.out.println("Enter state");
        String state = sc.next();
        p.setState(state);
        System.out.println("Enter email");
        String email = sc.next();
        p.setEmail(email);
        System.out.println("Enter phn no");
        int phNumber = sc.nextInt();
        p.setPhoneNumber(phNumber);
        System.out.println("Enter zip");
        int zip = sc.nextInt();
        p.setZip(zip);
    }

}

