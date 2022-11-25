import Builder.Director;
import Builder.MMBuilder;
import Builder.Product;
import Builder.TomatoNoodleBuilder;
import Singleton.Controller;
import Composite.*;
import Decorator.*;
public class Main {
    public static void main(String[] args) {

        Menu m = new Folder("菜單");

        Menu m1 = new Folder("義大利麵");
        Menu m2 = new Folder("飲料");
        Menu m3 = new Folder("甜點");

        Menu m1_It1 = new Item("唐揚雞義大利麵",150.0f);
        Menu m1_It2 = new Item("炙燒雞腿義大利麵",180.0f);
        Menu m2_It1 = new Item("拿鐵",50.0f);
        Menu m2_It2 = new Item("纖盈香草茶",60.0f);
        Menu m3_It1 = new Item("經典提拉米蘇",60.0f);
        Menu m3_It2 = new Item("草莓奶酪",80.0f);
        m.add(m1);
        m.add(m2);
        m.add(m3);

        m1.add(m1_It1);
        m1.add(m1_It2);


        m2.add(m2_It1);
        m2.add(m2_It2);

        m3.add(m3_It1);
        m3.add(m3_It2);

        System.out.println("-------"+m.getName()+"------"); //菜單根目錄
        for (int i =0;i< m.getChildren().size();i++)
        {
            System.out.println("===="+m.getChildren().get(i).getName()+"===="); //菜單目錄
            for (int j =0;j< m.getChildren().get(i).getChildren().size();j++)
            {
                System.out.println(m.getChildren().get(i).getChildren().get(j).getName()); //菜名
                System.out.println(m.getChildren().get(i).getChildren().get(j).getPrice()); //菜價格
            }
        }


        /*
        MMBuilder tomatonoodle = new TomatoNoodleBuilder();
        Director director = new Director(tomatonoodle);
        director.makeProduct();
        Order product = director.getProduct();

        product = new AddOrder( product,"唐揚雞",150.0f);
        product = new AddOrder( product,"牛肉湯",50.0f);
        product = new AddOrder( product,"焦糖布丁",50.0f);

        System.out.println(product.getName());
        System.out.println(product.getCost()+"元");
        */
    }
}