package P013_L010_Monster;

public class Dracula extends HorribleMonster implements Monster{
    @Override
    public void scareChildren() {
    }

    @Override
    public void destroy() {
        System.out.println("I'm Dracula and i destroy something");
    }

    @Override
    public void kill() {

    }
}
