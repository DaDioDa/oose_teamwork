package Builder;

public class TomatoNoodle implements MMBuilder
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
