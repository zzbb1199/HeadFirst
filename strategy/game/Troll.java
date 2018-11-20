package strategy.game;

public class Troll extends Character {
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
