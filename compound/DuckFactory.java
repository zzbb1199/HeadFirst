package compound;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    Quackable createDuckCall() {
        return new DuckCall();
    }
}
