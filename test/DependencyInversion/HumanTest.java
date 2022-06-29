package DependencyInversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {

    @Test
    public void theTest(){
       ParoWalk paroWalk= new ParoWalk();
       Walk walk=new CatWalk();
       Human buga = new Human(walk);
       buga.walk();
       buga.setWaka(paroWalk);
       buga.walk();
    }

    @Test
    public void abstractN(){
        AbstractNonsense abstractNonsense = new AbstractNonsense(){
            @Override
            public void run() {
                System.out.println("I dey run o!");
            }
        };

        AbstractNonsense abstractS = new AbstractNonsense(){

            @Override
            public void run() {
                System.out.println("I dey sleep o!");
            }
        };
        AbstractNonsense abstractT=new AbstractNonsense() {
        };
        abstractS.run();
    }

}