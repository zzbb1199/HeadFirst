package modulemothod;

public class Main {
    public static void main(String[] args){
        //init
        CaffeWithHook caffeWithHook = new CaffeWithHook();
        TeaWithHook teaWithHook = new TeaWithHook();

        //run
        caffeWithHook.prepare();
        teaWithHook.prepare();
    }
}
