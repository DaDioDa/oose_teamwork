package Decorator;

public interface Order {
    String name = null;
    float price = 0.0f;
    public float getCost();
    public String getName();
}