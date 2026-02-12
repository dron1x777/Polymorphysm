public class Monkey extends  Ainimal{

    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    void makeSound() {
        System.out.println(name + " is laughing");
    }

    @Override
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}
