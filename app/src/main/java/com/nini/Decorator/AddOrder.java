package Decorator;

public class AddOrder extends BaseOrder {
    private String name; //什麼主餐 or 甜點 or 湯 or 飲料 or 加麵 or 蛋
    private float price;

    public AddOrder(Order order, String name, float price)
    {
        super(order);
        this.name = name;
        this.price = price;
    }

    public float getCost() {
        return price + this.order.getCost();
    }

    public String getName() {
        return this.order.getName() + "\n佐" + name;
    }
}
