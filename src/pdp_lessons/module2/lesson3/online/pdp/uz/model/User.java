package pdp_lessons.module2.lesson3.online.pdp.uz.model;

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

    public boolean changePassword(String old_password) {
        return getPassword().equals(old_password);
    }

    public void setPassword(String password) {
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
