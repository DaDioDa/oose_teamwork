package Composite;
import java.util.ArrayList;
public class Folder implements Menu
{
    private ArrayList<Menu> children = new ArrayList<Menu>();
    private String name;
    private float price;

    public Folder(String name)
    {
        this.name = name;
    }

    public void add(Menu m)
    {
        children.add(m);
    }

    public void remove(Menu m)
    {
        children.remove(m);
    }

    public ArrayList<Menu> getChildren()
    {
        return children;
    }

    public String getName()
    {
        return name;
    }
    public float getPrice()
    {
        return price;
    }
}
