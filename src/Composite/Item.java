package Composite;

import Decorator.OrderType;

import java.util.ArrayList;

public class Item implements Menu
{
    private String name;
    private float price;
    public OrderType Type;
    public Item(String name,float price,OrderType type)
    {
        this.name = name;
        this.price = price;
        this.Type = type;
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
    public OrderType getType() {
        return Type;
    }

    @Override
    public ArrayList<Menu> getChildren() {
        return null;
    }
}