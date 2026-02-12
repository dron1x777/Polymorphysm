import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ainimal[] ainimals = {
                new Parrot("parrot1", 2),
                new Monkey("monkey1", 23),
                new Elephant("elephant1", 234),
                new Lion("lion1", 2345),
        };
        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.feedAllAnimals(ainimals);

    }
}