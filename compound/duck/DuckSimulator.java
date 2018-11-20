package compound.duck;

public class DuckSimulator {
    public static void main(String[] args){
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate(new QuackCounterFactory());
//        duckSimulator.simulate(new DuckFactory());
    }

    void simulate(AbstractDuckFactory factory){
        Quackable redheadDuck = factory.createRedHeadDuck();
        Quackable duckcall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckcall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseAdapter);

        Flock flockOfMarllards = new Flock();

        flockOfMarllards.add(factory.createMallardDuck());
        flockOfMarllards.add(factory.createMallardDuck());
        flockOfMarllards.add(factory.createMallardDuck());
        flockOfMarllards.add(factory.createMallardDuck());

        flockOfDucks.add(flockOfMarllards);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        System.out.println("Duck Simulator");
//        simulate(flockOfDucks);
        simulate(flockOfMarllards);

        System.out.println("Quack Times: "+QuackCounter.getQuackNumber());
    }

    void simulate(Quackable quackable){
        quackable.quack();
    }
}
