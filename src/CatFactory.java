import java.util.*;

public class CatFactory {
    private List<Cat> cat;
    private List<String> catNickname = new ArrayList<>(List.of("Jasper", "Tom", "Jerry"));
    private static final Scanner SC = new Scanner(System.in);
    private static final Random RND = new Random();
    private ActionWithCat actionWithCat = new ActionWithCat();
    private Cat cats = new Cat();
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
    public void addNewCat(){
        int health = RND.nextInt(81) + 20;
        int mood = RND.nextInt(81) + 20;
        int satiety = RND.nextInt(81) + 20;
        int average = ( health + mood + satiety) / 3;
        System.out.println("Enter new cat's name: ");
        String nickname = SC.next();
        System.out.println("Enter cat's age (1-18)");
        int age = getAge();
        cat.add(new Cat(nickname, age, health, mood, satiety, average));
    }

    public int getAge(){
        int age = SC.nextInt();
        try {
            if(age <= 0 || age > 18){
                throw new InputMismatchException();
            }
        }catch (InputMismatchException e ){
            printException();
            getAge();
        }
        return age;
    }
    public String chooseYourAction(){
        print();
        System.out.println("What do you want to do with cat?\n" +
                "(1) Feed your cat\n" +
                "(2) Play with cat\n" +
                "(3) Treat cat\n" +
                "(4) Add new cat\n" +
                "(5) Next Day");
        int choose = SC.nextInt();
        try {
            switch (choose) {
                case 1:
                    actionWithCat.feedCat(chooseCat());
                    break;
                case 2:
                    actionWithCat.playWithCat(chooseCat());
                    break;
                case 3:
                    actionWithCat.treatCt(chooseCat());
                    break;
                case 4:
                    addNewCat();
                    break;
                case 5:
                    actionWithCat.nextDay(cat);
            }
            if (choose <= 0 || choose > 5) {
                throw new NumberFormatException();
            }
        }catch (NumberFormatException | InputMismatchException e){
            printException();
            chooseYourAction();
        }
        return chooseYourAction();
    }
    public Cat chooseCat(){
        System.out.println("Choose cat");
        int chooseCat = SC.nextInt();
        try {
            if(chooseCat > cat.size()){
                throw new InputMismatchException();
            }
        }catch (InputMismatchException | IndexOutOfBoundsException e ){
            printException();
            chooseCat();
        }
        return cat.get(chooseCat-1);
    }

    public void print() {
        System.out.println("| # |      Name      |     Age     |     Health     |     Mood     |     Satiety     |     Average     |\n" +
                "+---+----------------+-------------+----------------+--------------+-----------------+-----------------+");
        for (int i = 0; i < cat.size(); i++) {
            System.out.printf("| %s |  %-13s |  %-10s |  %-13s |  %-11s |  %-14s |  %-14s |\n", i+1, getCat().get(i).getName(), getCat().get(i).getAge(), getCat().get(i).getHealth(),
                    getCat().get(i).getMood(), getCat().get(i).getSatiety(), getCat().get(i).getAverage());
        }
    }

    public void printException(){
        System.out.println("Enter correct data!\n" +
                "Try again!");
    }

    public List<Cat> getCat() {
        return cat;
    }
}
