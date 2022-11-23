package Builder;


public class PestoNoodleBuilder implements MMBuilder {
    private Product product;

    public PestoNoodleBuilder() {
        this.product = new Product();
    }

    public void buildSauce() {
        product.setSauce("青醬");
    }

    public void buildStarch() {
        product.setStarch("義大利麵");
    }

    public Product getProduct() {
        return this.product;
    }

}
