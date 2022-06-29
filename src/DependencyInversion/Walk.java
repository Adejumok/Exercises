package DependencyInversion;

public interface Walk {
    void walk();

    public default void run(){
        System.out.println("I'm running na.");
    }
}
