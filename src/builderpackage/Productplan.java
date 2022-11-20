package builderpackage;

public interface Productplan
{
    public void setStaich(String staich);
    public void setSauce(String sauce);

}

class Product implements Productplan
{
    private String sauce;   //tomato
    private String staich;  //rice
    private float cost;

    public void setStaich(String staich)
    {
        this.staich = staich;
    }

    public void setSauce(String sauce)
    {
        this.sauce = sauce;
    }
}

interface MMBuilder
{
    public void buildsauce();
    public void buildstaich();
    public Product getProduct();
}

class TomatoNoodle implements MMBuilder
{
    private Product Product;

    public TomatoNoodle() {
        this.Product = new Product();
    }

    public void buildsauce()
    {
        Product.setSauce("Tomato");
    }
    public void buildstaich()
    {
        Product.setStaich("Noodle");
    }

    public Product getProduct()
    {
        return this.Product;
    }
}

class Director
{
    private MMBuilder MMBuilder;
    public Director(MMBuilder MMBuilder)
    {
        this.MMBuilder = MMBuilder;
    }

    public Product getProduct()
    {
        return this.MMBuilder.getProduct();
    }

    public void makeProduct()
    {
        this.MMBuilder.buildsauce();
        this.MMBuilder.buildstaich();
    }
}
//main
class Builder
{
    public static void main(String[] args) {
        MMBuilder tomatonoodle = new TomatoNoodle();
        Director Director = new Director(tomatonoodle);
        Director.makeProduct();
        Product Product = Director.getProduct();
        //System.out.println("Main is "+ Product);
        System.out.println(tomatonoodle);
    }
}






