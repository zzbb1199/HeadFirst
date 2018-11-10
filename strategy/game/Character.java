package chapter1.game;

public class Character {
    WeaponBehavior weaponBehavior;

    void setWeaponBehavior(WeaponBehavior wb){
        weaponBehavior = wb;
    }

    void fight(){
        weaponBehavior.useWeapon();
    }
}
