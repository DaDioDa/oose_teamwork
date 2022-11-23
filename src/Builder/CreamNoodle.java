package Builder;


public class CreamNoodle implements MMBuilder {
    private Product product;

    public CreamNoodle() {
        this.product = new Product();
    }

    public void buildsauce() {
        product.setSauce("Cream");
    }

    public void buildstaich() {
        product.setStaich("Noodle");
    }

    public Product getProduct() {
        return this.product;
    }

}
