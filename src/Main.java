//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        // 引数あり
        Hero h1 = new Hero("ミナト");
        System.out.println(h1.name);
        // 引数なし
        Hero h2 = new Hero();
        System.out.println(h2.name);
    }
}