package src.menjinyan.java;

public class Demo23JavaBean {
    //属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    /*
    //空参
    public Demo23JavaBean() {
    }

    //带全部参数的构造
    public Demo23JavaBean(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
*/
    //针对每一个私有化都提供get和set方法
    /*public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getpassword() {
        return password;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getemail() {
        return email;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getgender() {
        return gender;
    }

    public void setage(int age) {
        this.age = age;
    }

    public int getage() {
        return age;
    }*/

    //快捷键：
    //alt+insert
    //alt+Fn+insert

    public Demo23JavaBean() {
    }

    public Demo23JavaBean(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
