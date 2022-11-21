import Singleton.Controller;
import Composite.*;
import Decorator.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Controller ctrl = new Controller();
        ctrl.Say();
        Menu m = new Folder("義大利麵");
        Menu It = new Item("唐揚雞義大利麵",150.0f);
        System.out.println(It.getPrice()+It.getName());

        Order p = new Product("紅醬");
        p = new AddOrder( p,"唐揚雞義大利麵",150.0f);
        p = new AddOrder( p,"牛肉湯",50.0f);
        p = new AddOrder( p,"焦糖布丁",50.0f);

        System.out.println(p.getName() + p.getCost());
    }
}