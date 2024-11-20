package src.集合;

public class User {
    private String id;
    private String uesername;
    private String password;

    public User() {
    }

    public User(String id, String password, String uesername) {
        this.id = id;
        this.password = password;
        this.uesername = uesername;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUesername() {
        return uesername;
    }

    public void setUesername(String uesername) {
        this.uesername = uesername;
    }
}
