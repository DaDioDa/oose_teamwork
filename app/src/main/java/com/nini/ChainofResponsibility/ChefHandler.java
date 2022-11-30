package ChainofResponsibility;

class ChefHandler extends Handler {
    public ChefHandler(Handler nextHandler) {
        super(nextHandler);
    }
    @Override
    void action() {
        System.out.println("ChefHandler");
    }
}
