package chapter1.game;

public class King extends Character {
    public King() {
        weaponBehavior = new KnifeBehavior();   //默认使用knife
    }
}
