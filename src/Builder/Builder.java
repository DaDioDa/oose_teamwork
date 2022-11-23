package Builder;

//main
public class Builder {
    public static void main(String[] args) {
        //tomato noodle
        MMBuilder tomatonoodle = new TomatoNoodle();
        Director director = new Director(tomatonoodle);
        director.makeProduct();
        Product product = director.getProduct();
        System.out.println(product.getSauce() + product.getStaich());

        //cream noodle
        MMBuilder creamnoodle = new CreamNoodle();
        Director director2 = new Director(creamnoodle);
        director2.makeProduct();
        Product product2 = director2.getProduct();
        //System.out.println("Main is "+ Product);
        System.out.println(product2.getSauce() + product2.getStaich());

        //pesto noodle
        MMBuilder pestonoodle = new PestoNoodle();
        Director director3 = new Director(pestonoodle);
        director3.makeProduct();
        Product product3 = director3.getProduct();
        //System.out.println("Main is "+ Product);
        System.out.println(product3.getSauce() + product3.getStaich());
    }
}
