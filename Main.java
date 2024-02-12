import java.util.*;
public class Main {
    public static void main(String[] args)throws CustomException {
        System.out.println("Welcome to the Address Book!");
        Person p1=new Person();
        AddressBookService s1 =new AddressBookService();
        AddressBookHashFunction a1=new AddressBookHashFunction();
        try {
            s1.setValues(p1);
            System.out.println(s1.display(p1));
            a1.contactList.put(1, p1);
            System.out.println(a1.contactList);
            a1.editContactByName(s1);
            System.out.println(s1.display(p1));
            a1.deletePersonByName();
            System.out.println(s1.display(p1));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}