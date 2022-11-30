package Composite;

import java.util.ArrayList;
import java.util.Collection;

public interface Menu {
    public String getName();
    public float getPrice();
    public void add(Menu m);
    public void remove(Menu m);

    public ArrayList<Menu> getChildren();
}
