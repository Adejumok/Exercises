package DependencyInversion;

public class CatWalk implements Walk{

    @Override
    public void walk() {
        System.out.println("Walks like a cat.");
    }
}
