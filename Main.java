public class Main {
    public static void main(String[] args) {
        Person p1=new Person();
        AddressBookService s1 =new AddressBookService();
        AddressBookHashFunction a1=new AddressBookHashFunction();
        s1.setValues(p1);
        System.out.println(s1.display(p1));
        a1.contactList.put(6,p1);
        System.out.println(a1.contactList);


    }
}