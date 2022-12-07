import Builder.Director;
import Builder.MMBuilder;
import Builder.Product;
import Builder.TomatoNoodleBuilder;
import ChainofResponsibility.ChefHandler;
import ChainofResponsibility.DessertHandler;
import ChainofResponsibility.DrinkHandler;
import ChainofResponsibility.Handler;
import Singleton.Controller;
import Composite.*;
import Decorator.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu RootMenu = new Folder("菜單");

        Menu m1 = new Folder("主菜");
        Menu m2 = new Folder("湯品");
        Menu m3 = new Folder("甜點");
        Menu m4 = new Folder("飲料");
        //--製造菜的object start--
        Menu m1_It1 = new Item("唐揚雞",150.0f,OrderType.MainDish);
        Menu m1_It2 = new Item("炙燒雞腿",180.0f,OrderType.MainDish);
        Menu m2_It1 = new Item("玉米巧達濃湯",50.0f,OrderType.MainDish);
        Menu m2_It2 = new Item("杏鮑菇南瓜濃湯",50.0f,OrderType.MainDish);
        Menu m4_It1 = new Item("拿鐵",50.0f,OrderType.Drink);
        Menu m4_It2 = new Item("纖盈香草茶",60.0f,OrderType.Drink);
        Menu m3_It1 = new Item("經典提拉米蘇",60.0f,OrderType.Dessert);
        Menu m3_It2 = new Item("草莓奶酪",80.0f,OrderType.Dessert);
        //--製造菜的object end--

        //--新增菜單跟菜start--
        RootMenu.add(m1);
        RootMenu.add(m2);
        RootMenu.add(m3);
        RootMenu.add(m4);
        m1.add(m1_It1);
        m1.add(m1_It2);
        m2.add(m2_It1);
        m2.add(m2_It2);
        m3.add(m3_It1);
        m3.add(m3_It2);
        m4.add(m4_It1);
        m4.add(m4_It2);
        //--新增菜單跟菜end--
        /*
        System.out.println("-------"+RootMenu.getName()+"------"); //菜單根目錄
        for (int i =0;i< RootMenu.getChildren().size();i++)
        {
            Menu EachMenu = RootMenu.getChildren().get(i);
            System.out.println("===="+EachMenu.getName()+"===="); //菜單目錄
            for (int j =0;j< EachMenu.getChildren().size();j++)
            {
                System.out.println(EachMenu.getChildren().get(j).getName()); //菜名
                System.out.println(EachMenu.getChildren().get(j).getPrice()); //菜價格
            }
        }
        */
        StartOrder(RootMenu);

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

    private static void StartOrder(Menu rootMenu)
    {
        Scanner sc = new Scanner(System.in);

        MMBuilder tomatonoodle = new TomatoNoodleBuilder();
        Director director = new Director(tomatonoodle);
        director.makeProduct();
        Order product = director.getProduct();

        for (int i = 0; i < rootMenu.getChildren().size(); i++) {
            Menu EachMenu = rootMenu.getChildren().get(i);
            System.out.println("點" + EachMenu.getName());
            for (int j = 0; j < EachMenu.getChildren().size(); j++) {
                Menu EachItem = EachMenu.getChildren().get(j);
                System.out.println((j + 1) + ". " + EachItem.getName() + "\t" + EachItem.getPrice() + "$");
            }
            System.out.print("輸入餐點號碼：");
            int ask = sc.nextInt();
            product = new AddOrder(product, EachMenu.getChildren().get(ask-1).getName(),EachMenu.getChildren().get(ask-1).getPrice(),EachMenu.getChildren().get(ask-1).getType());
        }
        System.out.println(product.getName());
        System.out.print(product.getCost() + "元\n");

        Handler handler = new ChefHandler(
                new DessertHandler(
                        new DrinkHandler(null)
                )
        );
        handler.execute(product);
    }
}