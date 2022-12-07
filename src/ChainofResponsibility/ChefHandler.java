package ChainofResponsibility;

import Decorator.Order;
import Decorator.OrderType;

public class ChefHandler extends BaseHandler {
    public ChefHandler(Handler nextHandler) {
        super(nextHandler);
    }

    public void action(Order product)
    {
        product.CallChain(this);
    }


    @Override
    public void CheckType(OrderType type, String name) {
        if(type == OrderType.MainDish)
        {
            System.out.println("Chef should make "+ name);
        }
    }
}
