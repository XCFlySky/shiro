package shiro;

public class Single1 {
    private static volatile Single1 single1;
    private Single1(){}

    public static Single1 getInstance(){
        if (single1==null) {
            synchronized (Single1.class) {
                if (single1==null) {
                    single1 = new Single1();
                }
            }
        }
        return single1;
    }
}
