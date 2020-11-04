package pdp_lessons.module3.lesson1.task4;

public enum Months {

    January(1, "Yanvar"),
    February(2, "Fevral"),
    March(3, "Mart"),
    April(4, "Aprel"),
    May(5, "May"),
    June(6, "Iyun"),
    July(7, "Iyul"),
    August(8, "Avgust"),
    September(9, "Sentabr"),
    October(10, "Oktabr"),
    November(11, "Noyabr"),
    December(12, "Dekabr");

    private int index;
    private String nameUzb;

    Months(int index, String nameUzb) {
        this.index = index;
        this.nameUzb = nameUzb;
    }

    public int getIndex() {
        return index;
    }

    public String getNameUzb() {
        return nameUzb;
    }

}
