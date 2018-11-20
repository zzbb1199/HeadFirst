package strategy.game;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use bow and arrow behavior");
    }
}
