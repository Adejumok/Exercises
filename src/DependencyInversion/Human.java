package DependencyInversion;

public class Human {

    private Walk waka;

    public Human(Walk waka) {
        this.waka = waka;
    }

    public void setWaka(Walk waka) {
        this.waka = waka;
    }

    public void walk(){
        waka.walk();
    }
}
