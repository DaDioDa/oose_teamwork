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
    private Product product;

    public TomatoNoodle() {
        this.product = new Product();
    }

    public void buildsauce()
    {
        product.setSauce("Tomato");
    }
    public void buildstaich()
    {
        product.setStaich("Noodle");
    }

    public Product getProduct()
    {
        return this.product;
    }

}

class CreamNoodle implements MMBuilder
{
    private Product product;

    public CreamNoodle() {
        this.product = new Product();
    }

    public void buildsauce()
    {
        product.setSauce("Cream");
    }
    public void buildstaich()
    {
        product.setStaich("Noodle");
    }

    public Product getProduct()
    {
        return this.product;
    }

}

class PestoNoodle implements MMBuilder
{
    private Product product;

    public PestoNoodle() {
        this.product = new Product();
    }

    public void buildsauce()
    {
        product.setSauce("Pesto");
    }
    public void buildstaich()
    {
        product.setStaich("Noodle");
    }

    public Product getProduct()
    {
        return this.product;
    }

}

class Director
{
    private MMBuilder mmBuilder;
    public Director(MMBuilder mmBuilder)
    {
        this.mmBuilder = mmBuilder;
    }
    public void setBuilder(MMBuilder mmBuilder)
    {
        this.mmBuilder = mmBuilder;
    }

    public Product getProduct()
    {
        return this.mmBuilder.getProduct();
    }

    public void makeProduct()
    {
        this.mmBuilder.buildsauce();
        this.mmBuilder.buildstaich();
    }
}
//main
class Builder
{
    public static void main(String[] args) {
        //tomato noodle
        MMBuilder tomatonoodle = new TomatoNoodle();
        Director director = new Director(tomatonoodle);
        director.makeProduct();
        Product product = director.getProduct();
        System.out.println(tomatonoodle);

        //cream noodle
        MMBuilder creamnoodle = new CreamNoodle();
        Director director2 = new Director(creamnoodle);
        director2.makeProduct();
        Product product2 = director2.getProduct();
        //System.out.println("Main is "+ Product);
        System.out.println(creamnoodle);

        //pesto noodle
        MMBuilder pestonoodle = new PestoNoodle();
        Director director3 = new Director(pestonoodle);
        director3.makeProduct();
        Product product3 = director3.getProduct();
        //System.out.println("Main is "+ Product);
        System.out.println(pestonoodle);
    }
}






