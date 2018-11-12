package modulemothod;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println(this.getClass().getSimpleName()+"brew");
    }

    @Override
    public void add() {
        System.out.println(this.getClass().getSimpleName()+"add");
    }
}
