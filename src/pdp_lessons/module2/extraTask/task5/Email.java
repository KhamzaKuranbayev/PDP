package pdp_lessons.module2.extraTask.task5;

public class Email {

    private String email;
    private String firstname;
    private String lastname;
    private String password;
    private String[] outbox = new String[10];
    private String[] inbox = new String[10];
    private boolean[] status = new boolean[10]; // true - unread; false - read;

    private String[] subjects = new String[10];
    private Email[] sender = new Email[10];
    private Email[] receiver = new Email[10];

    private int[] indexes = new int[10];


    public Email(String email, String firstname, String lastname, String password) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getOutbox() {
        return outbox;
    }

    public String[] getInbox() {
        return inbox;
    }

    public void setInbox(String message, String subject, Email sender) {
        int index = 0;
        if (getCountSpace(inbox) != 0) {
            for (int i = 0; i < 10; i++) {
                if (inbox[i] == null) {
                    index = i;
                    break;
                }
            }
        }
        inbox[index] = message;
        setSubjects(index, subject);
        setStatus(index, true);
        setSender(index, sender);

    }

    public void setOutbox(String message, String subject, Email receiver) {

        int index = 0;
        if (getCountSpace(outbox) != 0) {
            for (int i = 0; i < 10; i++) {
                if (outbox[i] == null) {
                    index = i;
                    break;
                }
            }
        }

        outbox[index] = message;
        setSubjects(index, subject);
        this.receiver[index] = receiver;
    }


    public int getCountSpace(String[] arr) {
        int count = 0;
        for (String str : arr) {
            if (str == null)
                count++;
        }
        return count;
    }

    public boolean[] getStatus() {
        return status;
    }

    public void setStatus(int index, boolean b) {
        this.status[index] = b;
    }

    public String getSubjects(int index) {
        return subjects[index];
    }

    public String getMessageByIndex(int index) {
        return outbox[index];
    }

    public String getMessageByIndexInbox(int index) {
        return inbox[index];
    }

    public void setSubjects(int index, String subject) {
        this.subjects[index] = subject;
    }

    public void setSender(int index, Email sender) {
        this.sender[index] = sender;
    }

    public Email getSender(int index) {
        return sender[index];
    }

    public Email getReceiver(int index) {
        return receiver[index];
    }

    public boolean checkEmail(String email) {
        return getEmail().equals(email);
    }

    public boolean checkPassword(String password) {
        return getPassword().equals(password);
    }

    public boolean isChangePassword(String current_password) {
        return getPassword().equals(current_password);
    }

    public int getCountUnreadMessages() {
        int count_unread = 0;
        for (boolean b : status) {
            if (b)
                count_unread++;
        }
        return count_unread;
    }

    public boolean isEmptyBox(String[] box) {
        int count = 0;
        for (String s : box) {
            if (s == null)
                count++;
        }
        return count == box.length;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " | " + email;
    }
}
