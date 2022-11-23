package ChainofResponsibility;

public class Main {
    public static void main(String[] args) {
        System.out.println("ChainofResponsibility");
        Handler handler = new ChefHandler(
                new DessertHandler(
                        new DrinkHandler(null)
                )
        );
        handler.execute();
    }
}
