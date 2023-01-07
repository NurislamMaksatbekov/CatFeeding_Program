import java.util.List;
import java.util.Random;

public class ActionWithCat implements Actionable{
    @Override
    public void feedCat(Cat cat) {
        if(cat.isAvailable()){
            cat.setAvailable(!cat.isAvailable());
            if(cat.getAge() <= 5){
                cat.setSatiety(cat.getSatiety() + 7);
                cat.setAverage((cat.getHealth() + cat.getMood() + cat.getSatiety()) / 3);
            }else if(cat.getAge() >= 6 && cat.getAge() < 10){
                cat.setAverage((cat.getHealth() + cat.getMood() + cat.getSatiety()) / 3);
                cat.setSatiety(cat.getSatiety() + 5);
            }else {
                cat.setAverage((cat.getHealth() + cat.getMood() + cat.getSatiety()) / 3);
                cat.setSatiety(cat.getSatiety() + 4);
            }
        }else {
            System.out.println("YOU CAN'T USE THIS CAT!\n" +
                    "CHOOSE ANOTHER ONE!");        }
    }
    @Override
    public void playWithCat(Cat cat) {
        if(cat.isAvailable()){
            cat.setAvailable(!cat.isAvailable());
            if(cat.getAge() <= 5){
                cat.setHealth(cat.getHealth() + 7);
                cat.setMood(cat.getMood() + 7);
                cat.setSatiety(cat.getSatiety() - 3);
                cat.setAverage((cat.getHealth() + cat.getMood() + cat.getSatiety()) / 3);
            }else if(cat.getAge() >= 6 && cat.getAge() < 10){
                cat.setSatiety(cat.getSatiety() - 5);
                cat.setHealth(cat.getHealth() + 5);
                cat.setMood(cat.getMood() + 5);
                cat.setAverage((cat.getHealth() + cat.getMood() + cat.getSatiety()) / 3);
            }else {
                cat.setHealth(cat.getHealth() + 4);
                cat.setMood(cat.getMood() + 4);
                cat.setSatiety(cat.getSatiety() - 6);
                cat.setAverage((cat.getHealth() + cat.getMood() + cat.getSatiety()) / 3);
            }
        } else {
            System.out.println("YOU CAN'T USE THIS CAT!\n" +
                    "CHOOSE ANOTHER ONE!");        }

    }
    @Override
    public void treatCt(Cat cat) {
        if(cat.isAvailable()){
            cat.setAvailable(!cat.isAvailable());
            if(cat.getAge() <= 5){
                cat.setHealth(cat.getHealth() + 7);
                cat.setMood(cat.getMood() - 3);
                cat.setSatiety(cat.getSatiety() - 3);
                cat.setAverage((cat.getHealth() + cat.getMood() + cat.getSatiety()) / 3);
            }else if(cat.getAge() >= 6 && cat.getAge() < 10){
                cat.setSatiety(cat.getSatiety() - 5);
                cat.setHealth(cat.getHealth() + 5);
                cat.setMood(cat.getMood() - 5);
                cat.setAverage((cat.getHealth() + cat.getMood() + cat.getSatiety()) / 3);
            }else {
                cat.setHealth(cat.getHealth() + 4);
                cat.setMood(cat.getMood() - 5);
                cat.setSatiety(cat.getSatiety() - 6);
                cat.setAverage((cat.getHealth() + cat.getMood() + cat.getSatiety()) / 3);
            }
        } else {
            System.out.println("YOU CAN'T USE THIS CAT!\n" +
                    "CHOOSE ANOTHER ONE!");
        }
    }
    @Override
    public void nextDay(List<Cat> cat) {
        Random rnd = new Random();
        int health = rnd.nextInt(7) - 3;
        int mood = rnd.nextInt(7) - 3;
        int satiety = rnd.nextInt(4)  + 1;
        for (Cat cats :cat) {
            cats.setHealth(cats.getHealth() - health);
            cats.setMood(cats.getMood() - mood);
            cats.setSatiety(cats.getSatiety() - satiety);
            cats.setAverage((cats.getHealth() + cats.getMood() + cats.getSatiety()) / 3);
                cats.setAvailable(true);
        }
    }
}
