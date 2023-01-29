package dsa.array.easy.singleton;

public class Singleton {

    private static Singleton INSTANCE = null;

    private String name;
    private Singleton() {

    }

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            System.out.print("Creating instance for the very first time..");
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public String getName() {
        return name;
    }
}
