import Builder.Director;
import Builder.MMBuilder;
import Builder.Product;
import Builder.TomatoNoodleBuilder;
import Singleton.Controller;
import Composite.*;
import Decorator.*;
public class Main {
    public static void main(String[] args) {

        //Menu m = new Folder("義大利麵");
        //Menu It = new Item("唐揚雞義大利麵",150.0f);
        //System.out.println(It.getPrice()+It.getName());

        MMBuilder tomatonoodle = new TomatoNoodleBuilder();
        Director director = new Director(tomatonoodle);
        director.makeProduct();
        Order product = director.getProduct();

        product = new AddOrder( product,"唐揚雞",150.0f);
        product = new AddOrder( product,"牛肉湯",50.0f);
        product = new AddOrder( product,"焦糖布丁",50.0f);

        System.out.println(product.getName());
        System.out.println(product.getCost()+"元");
    }
}