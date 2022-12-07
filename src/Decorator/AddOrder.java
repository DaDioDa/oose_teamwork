package Decorator;

import ChainofResponsibility.Handler;

public class AddOrder extends BaseOrder {
    private String name; //什麼主餐 or 甜點 or 湯 or 飲料 or 加麵 or 蛋
    private float price;

    OrderType type = null;

    public AddOrder(Order order, String name, float price, OrderType type)
    {
        super(order);
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public float getCost() {
        return price + this.order.getCost();
    }

    public String getName() {
        return this.order.getName() + "\n佐" + name;
    }

    @Override
    public void CallChain(Handler handler) {
        handler.CheckType(this.type, name);
        this.order.CallChain(handler);
    }
}
