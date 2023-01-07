import java.util.*;

public class CatFactory {
    private List<Cat> cat;
    private List<String> catNickname = new ArrayList<>(List.of("Jasper", "Tom", "Jerry"));
    private static final Scanner SC = new Scanner(System.in);
    private static final Random RND = new Random();

    public CatFactory() {
        this.cat = makeCat();
    }

    public List<Cat> makeCat(){
        List<Cat> cats = new ArrayList<>();
        for (int i = 0; i < catNickname.size(); i++) {
            int age = RND.nextInt(17) + 1;
            int health = RND.nextInt(81) + 20;
            int mood = RND.nextInt(81) + 20;
            int satiety = RND.nextInt(81) + 20;
            int average = (health + mood + satiety) / 3;
            String name = catNickname.get(i);
            cats.add(new Cat(name, age, health, mood, satiety, average));
        }
        cats.sort((s1, s2) -> s2.getAverage() - s1.getAverage());
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

    public void addNewCat(){
        String nickname;
        int health = RND.nextInt(81) + 20;
        int mood = RND.nextInt(81) + 20;
        int satiety = RND.nextInt(81) + 20;
        int average = ( health + mood + satiety) / 3;
        System.out.println("Enter new cat's name: ");
        nickname = SC.nextLine();
        System.out.println("Enter cat's age (1-18)");
        int age = getAge();
        cat.add(new Cat(nickname, age, health, mood, satiety, average));
    }
    public int getAge(){
        int age = 0;
        try {
            age = SC.nextInt();
            if(age <= 0 || age > 18){
                throw new InputMismatchException();
            }
        }catch (InputMismatchException e ){
            System.out.println("Enter Correct data!");
            getAge();
        }
        return age;
    }

    public List<Cat> getCat() {
        return cat;
    }

    public List<String> getCatNickname() {
        return catNickname;
    }
}
