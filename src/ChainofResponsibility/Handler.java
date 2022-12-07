package ChainofResponsibility;

import Decorator.Order;
import Decorator.OrderType;

public interface Handler {
    Handler nextHandler = null;

    public void execute(Order product);
    abstract void action(Order product);

    public abstract void CheckType(OrderType type, String name);
}
