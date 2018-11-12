package modulemothod;

public abstract class CaffeineBeverageWithHook {
    //加入final 关键字放置被子类覆盖
    public final void prepare(){
        boiled();
        brew();
        pourIntoCup();
        add();
        hook();
    }


    private void boiled(){
        System.out.println(this.getClass().getSimpleName()+"boiled");
    }

    protected abstract void brew();


    private void pourIntoCup(){
        System.out.println(this.getClass().getSimpleName()+"pourIntoCup");
    }

    protected abstract void add();

    /**
     * 钩子函数，被子类灵活调用，或者控制模板中的可选项
     */
    public void hook(){

    }
}
