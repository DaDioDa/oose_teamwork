package Composite;

public class Item implements Menu
{
    private String name;
    private float price;
    public Item(String name,float price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public float getPrice()
    {
        return price * 0.9f;
    }
}