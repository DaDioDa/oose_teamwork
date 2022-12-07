package ChainofResponsibility;

import Decorator.Order;
import Decorator.OrderType;

public class DessertHandler extends BaseHandler {
    public DessertHandler(Handler nextHandler) {
        super(nextHandler);
    }

    public void action(Order product)
    {
        product.CallChain(this);
    }

    @Override
    public void CheckType(OrderType type, String name) {
        if(type == OrderType.Dessert)
        {
            System.out.println("Pastry chef should make "+ name);
        }
    }
}
