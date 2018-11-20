package strategy.game;

public class Knight extends Character {
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }
}
