package Composite;

import java.util.ArrayList;

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
        return price;
    }

    @Override
    public void add(Menu m) {

    }

    @Override
    public void remove(Menu m) {

    }

    @Override
    public ArrayList<Menu> getChildren() {
        return null;
    }
}