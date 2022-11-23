package Builder;


public class CreamNoodleBuilder implements MMBuilder {
    private Product product;

    public CreamNoodleBuilder() {
        this.product = new Product();
    }

    public void buildSauce() {
        product.setSauce("白醬");
    }

    public void buildStarch() {
        product.setStarch("義大利麵");
    }

    public Product getProduct() {
        return this.product;
    }

}
