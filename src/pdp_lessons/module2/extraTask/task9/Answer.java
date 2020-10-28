package pdp_lessons.module2.extraTask.task9;

public class Answer {

    private String id;
    private String text;
    private boolean status;

    public Answer(String id, String text, boolean status) {
        this.id = id;
        this.text = text;
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + ". " + text;
    }
}
