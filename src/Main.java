public class Main {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        CatFactory catFactory = new CatFactory();
        catFactory.chooseYourAction();
    }
}