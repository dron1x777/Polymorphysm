public class Elephant extends Ainimal{
    public Elephant(String name, int age) {
        super(name, age);
    }
    @Override
    void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    void makeSound() {
        System.out.println(name + " is making sound");
    }
}
