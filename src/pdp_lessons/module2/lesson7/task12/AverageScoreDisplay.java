package pdp_lessons.module2.lesson7.task12;

public class AverageScoreDisplay implements Observer {

    int predictedScore;
    float runRate;

    public AverageScoreDisplay(int predictedScore, float runRate) {
        this.predictedScore = predictedScore;
        this.runRate = runRate;
    }

    @Override
    public void update() {

    }

    public int getPredictedScore() {
        return predictedScore;
    }

    public float getRunRate() {
        return runRate;
    }
}
