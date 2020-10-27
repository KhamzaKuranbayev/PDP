package pdp_lessons.module2.lesson8.task2;

public class Cat implements Animal {

    String foodName;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("The cat eat " + getFoodName());
    }

    public static boolean run() {
        return true;
    }
}
