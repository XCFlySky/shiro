package shiro;

public class Single {
    private final static Single single = new Single();

    private Single(){}

    public static Single getInstance() {
            return single;
    }
}
