import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CatFactory {
    private List<Cat> cat;
    private List<String> catNickname = new ArrayList<>(List.of("Jasper", "Tom", "Jerry"));

    public CatFactory() {
        this.cat = makeCat();
    }

    public List<Cat> makeCat(){
        List<Cat> cats = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < catNickname.size(); i++) {
            int age = rnd.nextInt(17) + 1;
            int mood = rnd.nextInt(81) + 20;
            int satiety = rnd.nextInt(81) + 20;
            int average = (age + mood + satiety) / 3;
            String name = catNickname.get(i);
            cats.add(new Cat(name, age, mood, satiety, average));
        }
        return cats;
    }
    public void print() {
        System.out.println("| # |      Name      |     Age     |     Health     |     Mood     |     Satiety     |     Average     |\n" +
                           "+---+----------------+-------------+----------------+--------------+-----------------+-----------------+");
        for (int i = 0; i < cat.size(); i++) {
            System.out.printf("| %s |  %-13s |  %-10s |  %-13s |  %-11s |  %-14s |  %-14s |\n", i, getCat().get(i).getName(), getCat().get(i).getAge(), getCat().get(i).getHealth(),
                    getCat().get(i).getMood(), getCat().get(i).getSatiety(), getCat().get(i).getAverage());
        }
    }

    public List<Cat> getCat() {
        return cat;
    }

    public List<String> getCatNickname() {
        return catNickname;
    }
}
