package src.StudentSystem;

public class User {
    private String usernamne;
    private String password;
    private String personID;
    private String PhoneNumber;

    public User() {
    }

    public User(String password, String personID, String phoneNumber, String usernamne) {
        this.password = password;
        this.personID = personID;
        PhoneNumber = phoneNumber;
        this.usernamne = usernamne;
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

    public String getUsernamne() {
        return usernamne;
    }

    public void setUsernamne(String usernamne) {
        this.usernamne = usernamne;
    }
}
