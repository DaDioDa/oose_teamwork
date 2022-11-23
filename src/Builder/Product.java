package Builder;

import Decorator.Order;

public class Product implements Order {
    private String sauce;   //tomato
    private String starch;  //rice
    private float cost;


    public void setStarch(String starch) {
        this.starch = starch;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public float getCost(){ return cost; }

    @Override
    public String getName() {
        return sauce + starch;
    }
}
