public class Wizard {
    String name;
    int hp;
    public void heal(hero h1){
        h1.hp +=10;
        System.out.println(h1.name+"のHPを１０回復した！");
    }
}
