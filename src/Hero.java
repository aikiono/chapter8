public class Hero {
    String name;
    int hp;
    Sword sword;
    public void attack() {
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に5ポイントのダメージをあたえた！");
    }
    // 引数あり
    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }
    // 引数なし
    public Hero() {
        this.hp = 100;
        this.name = "ダミー";
    }
}
