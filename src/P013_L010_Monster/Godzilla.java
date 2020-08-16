package P013_L010_Monster;

public class Godzilla extends HorribleMonster implements Monster {
    @Override
    public void scareChildren() {
    }

    @Override
    public void destroy() {
        System.out.println("I'm Godzilla and I destroy something");
    }

    @Override
    public void kill() {

    }
}
