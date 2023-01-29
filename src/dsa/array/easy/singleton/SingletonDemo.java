package dsa.array.easy.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.print("Object 2 created ...");
    }
}
