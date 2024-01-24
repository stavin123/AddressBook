public class AddressBookService {
    public String display(Person p){
        return p.getFirstName()+" "+p.getLastName()+" "+p.getCity()+" "+p.getState()+" "+ p.getEmail()+" "+p.getPhoneNumber()+ " "+p.getZip();
    }
}
