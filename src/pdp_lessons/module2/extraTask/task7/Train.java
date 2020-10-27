package pdp_lessons.module2.extraTask.task7;

public class Train {

    String trainNo;
    int seatCount;

    public Train(String trainNo, int seatCount) {
        this.trainNo = trainNo;
        this.seatCount = seatCount;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
}
