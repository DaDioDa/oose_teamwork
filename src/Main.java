import Singleton.Controller;
import Composite.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Controller ctrl = new Controller();
        ctrl.Say();
        Menu m = new Folder("義大利麵");
        Menu It = new Item("唐揚雞義大利麵",150.0f);
        System.out.println(It.getPrice()+It.getName());


    }
}