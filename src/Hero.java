public class Hero {
    String name;
    int hp;
    Sword sword;
    public void attack() {
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に5ポイントのダメージをあたえた！");
    }
    //newされた瞬間に自動的に1回だけ呼び出される
    public Hero() {
        this.hp = 100;    // hpフィールドを100で初期化
    }
}
