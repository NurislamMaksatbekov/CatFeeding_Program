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
        this.age = age;
        this.health = health;
        this.mood = mood;
        this.satiety = satiety;
        this.average = average;
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
