public class Wizard {
    String name;
    int hp;
    public void heal(Hero h){
        h.hp += 10;
        System.out.println(h.hp+"のHPを１０かいふくした！");
    }
}//魔法使い
