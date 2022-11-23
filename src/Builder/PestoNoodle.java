package Builder;


public class PestoNoodle implements MMBuilder {
    private Product product;

    public PestoNoodle() {
        this.product = new Product();
    }

    public void buildsauce() {
        product.setSauce("Pesto");
    }

    public void buildstaich() {
        product.setStaich("Noodle");
    }

    public Product getProduct() {
        return this.product;
    }

}
