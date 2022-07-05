package cn.c25;

public class DemoMain {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setCode("大宝剑");
        Hero hero = new Hero("盖伦",20,weapon);
//        hero.setName("盖伦");
//        hero.setAge(20);
//        hero.setWeapon(weapon);
        hero.attack();
    }
}
