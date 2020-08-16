package P013_L010_Monster;

public class MainMonster {
    public void callMonster (Monster [] monsters) {
        for (Monster monster : monsters) {
            monster.destroy();
        }
    }

}
