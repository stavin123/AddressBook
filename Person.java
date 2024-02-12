public class Person {
    private String FirstName;
    private String LastName;
    private String  Address;
    private String City;
    private String State;
    private int Zip;
    private int PhoneNumber;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZip() {
        return Zip;
    }

    public void setZip(int zip) {
        Zip = zip;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) throws CustomException {


        String s=String.valueOf(phoneNumber);

        if (s.matches("^[6-9]{1}[0-9]{9}+$")){
            PhoneNumber = phoneNumber;
        }
        else{
            throw new CustomException("Invalid Phone number Enter a valid phone number");
        }

    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) throws CustomException {
        if (email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            this.Email = email;
        } else {
            throw new CustomException("Invalid Email. Please enter a valid email address.");
        }
    }

    private String Email;
}
