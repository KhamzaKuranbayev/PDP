package pdp_lessons.module2.extraTask.task7;

public class TrainSchedule {

    Train train;
    String from;
    String to;
    static int ticketCount;

    public TrainSchedule(Train train, String from, String to, int ticketCount) {
        this.train = train;
        this.from = from;
        this.to = to;
        TrainSchedule.ticketCount = ticketCount;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        TrainSchedule.ticketCount = ticketCount;
    }

    @Override
    public String toString() {
        return "TrainSchedule{" +
                "train=" + train +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", ticketCount=" + ticketCount +
                '}';
    }
}
