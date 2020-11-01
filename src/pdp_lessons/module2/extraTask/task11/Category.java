package pdp_lessons.module2.extraTask.task11;

public class Category {

    private int id;
    private String name;
    private String definition;

    public Category(int id, String name, String definition) {
        this.id = id;
        this.name = name;
        this.definition = definition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
