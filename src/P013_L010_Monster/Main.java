package P013_L010_Monster;

public class Main {
    public static void main(String[] args) {
        Dracula dracula = new Dracula();
        Godzilla godzilla = new Godzilla();
        MainMonster mainMonster = new MainMonster();

        Monster [] monsters = {dracula,godzilla};

        mainMonster.callMonster(monsters);

    }
}
