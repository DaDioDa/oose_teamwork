package Decorator;

import ChainofResponsibility.Handler;

public interface Order {
    String name = null;
    float price = 0.0f;
    OrderType type = null;
    public float getCost();
    public String getName();

    public void CallChain(Handler handler);
}