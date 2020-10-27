package pdp_lessons.module2.lesson8.task2;

public class Tiger implements Animal {

    String foodName;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public void sound() {
        System.out.println("Tiger voiced");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eat" + getFoodName());
    }

    public static void run() {
        System.out.println("The tiger run");
    }

    public boolean attack() {
        return true;
    }
}
