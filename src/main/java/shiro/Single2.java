package shiro;

public class Single2 {
    private Single2(){}

    private static class Single2Instance{
        private static final Single2 single2= new Single2();
    }

    public static Single2 getSingle2(){
        return Single2Instance.single2;
    }
}
