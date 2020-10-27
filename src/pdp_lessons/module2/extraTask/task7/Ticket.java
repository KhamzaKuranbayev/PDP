package pdp_lessons.module2.extraTask.task7;

public class Ticket {

    int ticketNo;
    String departureStation;
    String destinationStation;
    int classCategory; // 3 class, 2 class, first class
    double price;
    Train train;

    public Ticket(int ticketNo, String departureStation, String destinationStation, int classCategory, double price, Train train) {
        this.ticketNo = ticketNo;
        this.departureStation = departureStation;
        this.destinationStation = destinationStation;
        this.classCategory = classCategory;
        this.price = price;
        this.train = train;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public int getClassCategory() {
        return classCategory;
    }

    public void setClassCategory(int classCategory) {
        this.classCategory = classCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}
