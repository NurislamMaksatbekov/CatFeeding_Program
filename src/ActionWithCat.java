import java.util.List;
import java.util.Random;

public class ActionWithCat implements Actionable{
    @Override
    public void feedCat(Cat cat) {
        if(cat.getAge() <= 5){
            cat.setSatiety(cat.getSatiety() + 7);
        }else if(cat.getAge() >= 6 && cat.getAge() < 10){
            cat.setSatiety(cat.getSatiety() + 5);
        }else {
            cat.setSatiety(cat.getSatiety() + 4);
        }
    }

    @Override
    public void playWithCat(Cat cat) {
        if(cat.getAge() <= 5){
            cat.setHealth(cat.getHealth() + 7);
            cat.setMood(cat.getMood() + 7);
            cat.setSatiety(cat.getSatiety() - 3);
        }else if(cat.getAge() >= 6 && cat.getAge() < 10){
            cat.setSatiety(cat.getSatiety() - 5);
            cat.setHealth(cat.getHealth() + 5);
            cat.setMood(cat.getMood() + 5);
        }else {
            cat.setHealth(cat.getHealth() + 4);
            cat.setMood(cat.getMood() + 4);
            cat.setSatiety(cat.getSatiety() - 6);
        }
    }

    @Override
    public void treatCt(Cat cat) {
        if(cat.getAge() <= 5){
            cat.setHealth(cat.getHealth() + 7);
            cat.setMood(cat.getMood() - 3);
            cat.setSatiety(cat.getSatiety() - 3);
        }else if(cat.getAge() >= 6 && cat.getAge() < 10){
            cat.setSatiety(cat.getSatiety() - 5);
            cat.setHealth(cat.getHealth() + 5);
            cat.setMood(cat.getMood() - 5);
        }else {
            cat.setHealth(cat.getHealth() + 4);
            cat.setMood(cat.getMood() - 5);
            cat.setSatiety(cat.getSatiety() - 6);
        }
    }

    @Override
    public void nextDay(Cat cat) {
        Random rnd = new Random();
        int health = rnd.nextInt(7) - 3;
        int mood = rnd.nextInt(7) - 3;
        int satiety = rnd.nextInt(7) - 3;
        cat.setHealth(cat.getHealth() - health);
        cat.setMood(cat.getMood() - mood);
        cat.setSatiety(cat.getSatiety() - satiety);
    }
}
