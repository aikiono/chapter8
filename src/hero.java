public class hero {
    String name;
    int hp;
    Sword sword;
    public void attack(){
        System.out.println(this.name+"葉攻撃した！");
        System.out.println("敵に5ポイントのダメージをあたえた！");
    }
    public hero(String name) {
        this.hp = 100;
        this.name = name;    // 引数の値でnameフィールドを初期化
    }
    public void sleep(){
        this.hp-=100;
        System.out.println(this.name+"は、眠って回復した！");
    }
    public void sit(int sec){
        this.hp -= sec;
        System.out.println(this.name+"は、"+sec +"秒フリーズした!");
        System.out.println("山札が"+sec+"枚減った！精神に"+sec+"のダメージ！");
    }
    public void slip(){
        this.hp-=5;
        System.out.println(this.name+"は、ループを喰らった");
        System.out.println("精神に5のダメージ！");
    }
    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終的に山札は、"+this.hp+"でした。もう全然ダメ！！");
    }
}
