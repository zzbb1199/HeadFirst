package strategy.game;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }
}
