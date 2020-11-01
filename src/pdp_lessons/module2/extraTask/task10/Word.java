package pdp_lessons.module2.extraTask.task10;

public class Word {

    private String key;
    private String text;
    private String description;

    public Word(String key, String text, String description) {
        this.key = key;
        this.text = text;
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
