package Builder;


public class Director {
    private MMBuilder mmBuilder;

    public Director(MMBuilder mmBuilder) {
        this.mmBuilder = mmBuilder;
    }

    public void setBuilder(MMBuilder mmBuilder) {
        this.mmBuilder = mmBuilder;
    }

    public Product getProduct() {
        return this.mmBuilder.getProduct();
    }

    public void makeProduct() {
        this.mmBuilder.buildSauce();
        this.mmBuilder.buildStarch();
    }
}
