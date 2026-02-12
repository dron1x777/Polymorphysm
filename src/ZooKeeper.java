import java.util.Arrays;

public class ZooKeeper {

    void feedAllAnimals(Ainimal[] animals) {
        for (Ainimal animal : animals) {
            animal.eat();
        }
    }
    void startMorningShow(Ainimal[] animals) {
        for (Ainimal animal : animals) {
            animal.makeSound();
        }
    }
    void endMorningShow(Ainimal[] animals) {
        for (Ainimal animal : animals) {
            animal.sleep();
        }
    }
}
