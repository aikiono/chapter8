//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Sword s =new Sword();
        s.name="炎の剣";
        s.damage=10;
        hero  h1 =new hero();
        h1.name = "あいき";
        h1.hp = 40;
        h1.sword = s;
        System.out.println("現在の武器は"+h1.sword.name);
        System.out.println(h1.hp);
        System.out.println(h1.name);

        hero h2 =new hero();
        h2.name = "アサカ";
        h2.hp = 40;

        Wizard w =new Wizard();
        w.name="スガワラ";
        w.hp =50;
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);


        Matango m1 =new Matango();
        m1.hp =50;
        m1.suffix='A';

        Matango m2 =new Matango();
        m2.hp =48;
        m2.suffix='B';

        h1.slip();
        m1.run();

        h1.slip();
        m2.run();

        System.out.println("勇者"+h1.name+"を逃げ出しました！");
        h1.sit(5);
        h1.slip();
        h1.sit(25);
        h1.run();
    }
}