import java.util.Random;

public class Cat {
    private String name;
    private int age;
    private int health;
    private int mood;
    private int satiety;
    private int average;

    public Cat(String name, int age, int health, int mood, int satiety, int average) {
        this.name = name;
        this.age = new Random().nextInt(17) +1;
        this.health = new Random().nextInt(81) + 20;
        this.mood = new Random().nextInt(81) + 20;
        this.satiety = new Random().nextInt(81) + 20;
        this.average = (health + mood + satiety) % 3;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {
        return health;
    }

    public int getMood() {
        return mood;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", health=" + health +
                ", mood=" + mood +
                ", satiety=" + satiety +
                '}';
    }
}
