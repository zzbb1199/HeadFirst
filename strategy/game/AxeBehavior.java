package strategy.game;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use axe behavior");
    }
}
