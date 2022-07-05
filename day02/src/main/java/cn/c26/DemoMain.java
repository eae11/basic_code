package cn.c26;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");
//        hero.setSkill(new SkillImpl());
        //还可以用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Piupiupiu");
//            }
//        };
//        hero.setSkill(skill);
        //进一步简化，同时使用匿名内部类和匿名对象。
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Piubiupiubiu");
            }
        });
        hero.attack();
    }
}
