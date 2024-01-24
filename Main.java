public class Main {
    public static void main(String[] args) {
        Person p1=new Person();
        AddressBookService s1 =new AddressBookService();
        System.out.println(s1.display(p1));
    }
}