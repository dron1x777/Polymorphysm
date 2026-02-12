public class Lion extends Ainimal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " is speaking");
    }

    @Override
    void eat() {
        System.out.println(name + " is shouting");
    }

    @Override
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}
