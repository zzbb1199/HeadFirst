package modulemothod;

public class CaffeWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println(this.getClass().getSimpleName()+"brew");
    }

    @Override
    public void add() {
        System.out.println(this.getClass().getSimpleName()+"add");
    }

    @Override
    public void hook() {
        super.hook();
        System.out.println();
    }
}
