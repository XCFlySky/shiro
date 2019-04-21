package shiro;

public class Single {
    private final static Single instance = new Single();

    private Single(){}

    public static Single getInstance() {
            return instance;
    }
}
