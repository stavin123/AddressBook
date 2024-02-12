import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern pat=Pattern.compile("^[a-zA-Z0-9_.$%&!]+@[a-zA-Z.]");
        String email = sc.next();
        Matcher mat=pat.matcher(email);
        if (mat.matches()) {
            p.setEmail(email);
        }
        else
            System.out.println("enter a valid email");
        System.out.println("Enter phn no");
        Pattern pa=Pattern.compile("^[6-9]{1}[0-9]{9}+$");
        int phNumber = sc.nextInt();
        String s=String.valueOf(phNumber);
        Matcher m=pa.matcher(s);
        if (m.matches()){
        p.setPhoneNumber(phNumber);
        }
        else {
            System.out.println("ph no. doesn't have 10 digits");
            System.exit(0);
        }
        System.out.println("Enter zip");
        int zip = sc.nextInt();
        p.setZip(zip);
    }

}

