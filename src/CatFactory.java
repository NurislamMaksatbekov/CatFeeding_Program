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
        Cat cat1 = new Cat();
        for (int i = 0; i < catNickname.size(); i++) {
            String name = catNickname.get(i);
            cats.add(new Cat(name, cat1.getAge(), cat1.getHealth(), cat1.getMood(), cat1.getSatiety(), cat1.getAverage()));
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
