public class User implements Authorization {
    String name;
    String email;
    District district;
    String password;
    String phone;

    public User(String name, String email, District district, String password, String phone) {
        this.name = name;
        this.email = email;
        this.district = district;
        this.password = password;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {{
        this.email = email;
    }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean login(String email, String password) {
        return getEmail().equals(email) && getPassword().equals(password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", district=" + district +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
