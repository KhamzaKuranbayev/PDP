package pdp_lessons.module2.lesson2.task5;

public class Pen {

    private boolean button;
    private double inq; // ruchkadagi bor bo'lgan siyoh miqdori
    private String inqColor;
    private double inqConsumption; // bitta harf uchun sarflanadigan siyoh miqdori

    //    Alt+(Fn)Insert =>Constructor yaratish uchun
    public Pen() {
    }

    public Pen(double inq, String inqColor, double inqConsumption) {
        this.inq = inq;
        this.inqColor = inqColor;
        this.inqConsumption = inqConsumption;
    }

    public Pen(boolean button, double inq, String inqColor, double inqConsumption) {
        this.button = button;
        this.inq = inq;
        this.inqColor = inqColor;
        this.inqConsumption = inqConsumption;
    }

    public void clickButton() {
        button = !button;

//        if (button){
//            button=false;
//        }else {
//            button=true;
//        }
    }

    public void write(String word) {
        if (button) {
            if (inq > 0) {
                System.out.println(word);

                // My code start
                word = word.trim();
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if (inq != 0) {
                        if (Character.isUpperCase(c)) {
                            inq -= 2 * inqConsumption;
                        } else if (c != ' ') {
                            inq -= inqConsumption;
                        }
                    }
                }
                // end

                // inq -= word.length() * inqConsumption; // yozilgan harflar uchun siyohni sarflanishi
            } else {
                System.out.println("Ruchkada siyoh qolmagan, sterjenni almashtiring.");
            }
        } else {
            System.out.println("Yozishdan oldin tugmani bosing.");
        }
    }

    public void changeSterjen(double inq) {
        this.inq = inq;
    }

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    public double getInq() {
        return inq;
    }

    public void setInq(double inq) {
        if (inq > 0) {
            this.inq = inq;
        }

    }

    public String getInqColor() {
        return inqColor;
    }

    public void setInqColor(String inqColor) {
        this.inqColor = inqColor;
    }

    public double getInqConsumption() {
        return inqConsumption;
    }

    public void setInqConsumption(double inqConsumption) {
        if (inqConsumption > 0) {
            this.inqConsumption = inqConsumption;
        }
    }
}
