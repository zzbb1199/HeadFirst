package adapter.duck;

public class Main {
    public static void main(String[] args){
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        Turkey duckAdapter = new DuckAdapter(mallardDuck);

        testDuck(mallardDuck);
        testDuck(turkeyAdapter);

        testTurkey(wildTurkey);
        testTurkey(duckAdapter);

    }
    static void testDuck(Duck duck){
        System.out.println(duck.getClass().getSimpleName());
        duck.fly();
        duck.quack();
        System.out.println();
    }

    static void testTurkey(Turkey turkey){
        System.out.println(turkey.getClass().getSimpleName());
        turkey.fly();
        turkey.gobble();
        System.out.println();
    }

}
