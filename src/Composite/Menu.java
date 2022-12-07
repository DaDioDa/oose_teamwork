package Composite;

import Decorator.OrderType;

import java.util.ArrayList;
import java.util.Collection;

public interface Menu {
    public String getName();
    public float getPrice();
    public void add(Menu m);
    public void remove(Menu m);
    public OrderType getType();

    public ArrayList<Menu> getChildren();
}
