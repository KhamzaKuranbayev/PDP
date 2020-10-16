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

    public void removeContact() {
        this.id = 0;
        this.phone_number = "";
        this.name = "";
        this.address = "";
        this.mail = "";
    }

    @Override
    public String toString() {
        if (id != 0 && !phone_number.isEmpty() && !name.isEmpty() && !address.isEmpty() && !mail.isEmpty()) {
            return "Id: " + id +
                    ", Telefon: " + phone_number +
                    ", Ismi: " + name +
                    ", Manzili: " + address +
                    ", Mail: " + mail;
        }
        return "";
    }
}
