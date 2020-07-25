package P011_L008_Human;

public class Human {

    private String name;
    private String type;
    private int age;
    private String food;

    public Human() {
    }

    public Human(String name, int type, int age) {
        setName(name);
        setType(type);
        setAge(age);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        int random = (int) (Math.random() * 10);
        this.food = getName() + " have to eat " + random + "kg of " + food.substring(food.indexOf(" ") + 1);
        System.out.println(this.food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(int type) {
        if (type == 1) {
            this.type = "Picker";
        }
        if (type == 2) {
            this.type = "Hunter";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                        " name='" + name + '\'' +
                        " type='" + type + '\'' +
                        " age=" + age;
    }
}