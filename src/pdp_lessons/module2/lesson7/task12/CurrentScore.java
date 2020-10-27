package pdp_lessons.module2.lesson7.task12;

public class CurrentScore implements Observer {

    int runs;
    int wickets;
    float overs;

    public CurrentScore(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
    }

    @Override
    public void update() {

    }

    public void display() {

    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public float getOvers() {
        return overs;
    }
}
