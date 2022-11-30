package Builder;

public class TomatoNoodleBuilder implements MMBuilder
{
    private Product product;


    public TomatoNoodleBuilder() {
        this.product = new Product();
    }

    public void buildSauce()
    {
        product.setSauce("紅醬");
    }
    public void buildStarch()
    {
        product.setStarch("義大利麵");
    }

    public Product getProduct()
    {
        return this.product;
    }

}
