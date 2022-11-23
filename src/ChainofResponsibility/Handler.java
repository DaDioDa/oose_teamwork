package ChainofResponsibility;

abstract class Handler {
    Handler nextHandler = null;
    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void execute() {
        action();
        if (nextHandler != null) {
            nextHandler.execute();
        }
    }
    abstract void action();
}
