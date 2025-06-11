public class Hero {
    String name;
    int hp;

    public void sleep(){
        this.hp = 100;
        System.out.println(this.name+"は、眠って回復した！");
    }//眠る（回復）

    public void sit(int sec){
        this.hp += sec;
        System.out.println(this.name+"は、"+this.hp+"秒座った！");
        System.out.println("HPが"+sec+"ポイント回復した");
    }//座る（回復）

    public void slip(){
        this.hp -= 5;
        System.out.println("５のダメージ");
    }//転ぶ

    public void run(){
        System.out.println(this.name+"逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは"+this.hp+"でした");
    }//逃げる
}//プレイヤー・行動
