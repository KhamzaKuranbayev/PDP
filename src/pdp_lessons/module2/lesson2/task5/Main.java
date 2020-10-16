package pdp_lessons.module2.lesson2.task5;

public class Main {
    public static void main(String[] args) {

        Pen ruchka = new Pen(200,"Ko'k",10);
        ruchka.clickButton();
        System.out.println(ruchka.getInq());
        ruchka.write("Hello OOP!");
        System.out.println(ruchka.getInq());
        ruchka.write("Hi HUTU");

        System.out.println("======= pen objecti=========");
        Pen pen=new Pen();
        pen.setInq(-100);//pen.inq=-100;
        pen.setInqColor("Qora");
        pen.setInqConsumption(10); //pen.inqConsumption=-10

        System.out.println(pen.getInq());
        pen.clickButton();
        pen.write("Hi");
        System.out.println(pen.getInq());
//        Encopsulation 2: 1) private, 2) getter va setter




    }
}
