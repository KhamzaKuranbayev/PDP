package uz.pdp.online.model;

public class User {
    int id;
    public String username;
    public String email;
    private String password;
    String name;
    String address;

    public User(int id, String username, String email, String password, String name, String address) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
    }

    public void changePassword(String old_password) {
        setPassword(old_password);
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "id= " + id +
                ", username= " + username +
                ", email= " + email +
                ", password= " + password +
                ", name= " + name +
                ", address= " + address;
    }
}
