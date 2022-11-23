package Builder;

//main
public class Builder {
    public static void main(String[] args) {
        //tomato noodle
        MMBuilder tomatonoodle = new TomatoNoodleBuilder();
        Director director = new Director(tomatonoodle);
        director.makeProduct();
        Product product = director.getProduct();
        System.out.println(product.getName());

        //cream noodle
        MMBuilder creamnoodle = new CreamNoodleBuilder();
        Director director2 = new Director(creamnoodle);
        director2.makeProduct();
        Product product2 = director2.getProduct();
        //System.out.println("Main is "+ Product);
        System.out.println(product2.getName());

        //pesto noodle
        MMBuilder pestonoodle = new PestoNoodleBuilder();
        Director director3 = new Director(pestonoodle);
        director3.makeProduct();
        Product product3 = director3.getProduct();
        //System.out.println("Main is "+ Product);
        System.out.println(product3.getName());
    }
}
