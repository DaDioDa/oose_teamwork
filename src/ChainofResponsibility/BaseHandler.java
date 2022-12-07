package ChainofResponsibility;

import Decorator.Order;
import Decorator.OrderType;

public abstract class BaseHandler implements Handler{
    Handler nextHandler = null;
    public BaseHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void execute(Order product) {
        action(product);
        if (nextHandler != null) {
            nextHandler.execute(product);
        }
    }
    public abstract void action(Order product);

    public abstract void CheckType(OrderType type, String name);
}
