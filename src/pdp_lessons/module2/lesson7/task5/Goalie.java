package pdp_lessons.module2.lesson7.task5;

public class Goalie extends SoccerPlayer {

    int goalsAllowed;

    public Goalie(int minutes, int goals, int goalsAllowed) {
        super(minutes, goals);
        this.goalsAllowed = goalsAllowed;
    }

    public double averageGoalsAllowed() {
        // 0.01842 times 90 minutes per game = 1.658.
        return getGoalsAllowed() * goalsPerGame();
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }
}
