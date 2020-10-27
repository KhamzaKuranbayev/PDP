package pdp_lessons.module2.lesson7.task5;

public class Pitcher extends BaseballPlayer {

    double innings;
    int earnedRuns;

    public Pitcher(int atBats, int hits, double innings, int earnedRuns) {
        super(atBats, hits);
        this.innings = innings;
        this.earnedRuns = earnedRuns;
    }

    public double earnedRunAverage() {
        // ERA = 9 × Earned Runs Allowed / Innings Pitched
        return 9 * (getEarnedRuns() / getInnings());
    }

    public double getInnings() {
        return innings;
    }

    public void setInnings(double innings) {
        this.innings = innings;
    }

    public int getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }
}
