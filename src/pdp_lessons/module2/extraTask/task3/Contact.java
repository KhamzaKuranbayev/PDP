package pdp_lessons.module2.extraTask.task3;

public class Contact {

    private int id;
    private String phone_number;
    private String name;
    private String address;
    private String mail;

    public int getId() {
        return id;
    }

    public Contact(int id, String phone_number, String name, String address, String mail) {
        this.id = id;
        this.phone_number = "+998" + phone_number;
        this.name = name;
        this.address = address;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                ", Telefon: " + phone_number +
                ", Ismi: " + name +
                ", Manzili: " + address +
                ", Mail: " + mail;
    }
}
