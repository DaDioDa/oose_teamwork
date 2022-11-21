package Decorator;

public class Product implements Order {
    private String name; //什麼醬
    private float price;
    public Product(String name)
    {
            this.name = name;
    }

    public float getCost()
    {
            return price;
    }

    public String getName()
    {
            return name;
    }
}