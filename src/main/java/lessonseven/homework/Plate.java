package lessonseven.homework;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("On plate " + food  + " food in quantity");
    }

    public void decreaseFood(int appetite) {
        if (appetite > food) {
            food  = 0;
        } else {
            food -= appetite;
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
