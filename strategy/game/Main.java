package strategy.game;

public class Main {
    public static void main(String[] args){
        Character c1 = new King();
        c1.fight();
        c1.setWeaponBehavior(new BowAndArrowBehavior());
        c1.fight();
    }
}
