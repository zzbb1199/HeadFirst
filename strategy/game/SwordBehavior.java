package strategy.game;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use Sword Behavior");
    }
}
