package ChainofResponsibility;

class DessertHandler extends Handler {
    public DessertHandler(Handler nextHandler) {
        super(nextHandler);
    }
    @Override
    void action() {
        System.out.println("DessertHandler");
    }
}
