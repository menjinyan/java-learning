package src.oop.final1.StudentSystem;

public class User {
    private String Username;
    private String password;
    private String personID;
    private String PhoneNumber;

    public User() {
    }

    public User(String password, String personID, String phoneNumber, String Username) {
        this.password = password;
        this.personID = personID;
        PhoneNumber = phoneNumber;
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsernamne(String Username) {
        this.Username = Username;
    }
}
////aaa