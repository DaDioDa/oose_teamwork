package ChainofResponsibility;

class DrinkHandler  extends Handler {
    public DrinkHandler (Handler nextHandler) {
        super(nextHandler);
    }
    @Override
    void action() {
        System.out.println("DrinkHandler");
    }
}
