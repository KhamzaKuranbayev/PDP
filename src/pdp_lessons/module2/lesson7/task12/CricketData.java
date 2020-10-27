package pdp_lessons.module2.lesson7.task12;


import java.util.List;

public class CricketData implements Subject {

    int runs;
    int wickets;
    float overs;
    List observer;

    public CricketData(int runs, int wickets, float overs, List observer) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        this.observer = observer;
    }

    @Override
    public void registerObserver(Observer o) {

    }

    @Override
    public void unregisterObserver(Observer o) {

    }

    @Override
    public void notifyObserver() {

    }

    public int getLatestRuns() {
        return runs;
    }

    public int getLatestWickets() {
        return wickets;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public float getLatestOvers() {
        return overs;
    }

}
