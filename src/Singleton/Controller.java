package Singleton;

public class Controller {

    private static Controller instance = new Controller();

    private Controller(){}

    public static Controller getInstance()
    {
        return instance;
    }

    public void Say()
    {
        System.out.println("This is my controller!");
    }
}
