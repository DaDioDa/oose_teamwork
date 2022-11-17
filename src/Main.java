import Singleton.Controller;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Controller ctrl = Controller.getInstance();
        ctrl.Say();
    }
}