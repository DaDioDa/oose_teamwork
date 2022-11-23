package Builder;

public class Product implements Productplan {
    private String sauce;   //tomato
    private String staich;  //rice
    private float cost;

    public void setStaich(String staich) {
        this.staich = staich;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getStaich(){return this.staich;}

    public String getSauce(){return  this.sauce;}
}
