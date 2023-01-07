import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        CatFactory catFactory = new CatFactory();
        catFactory.print();
        catFactory.chooseYourAction();
        catFactory.addNewCat();
        catFactory.print();

    }
}