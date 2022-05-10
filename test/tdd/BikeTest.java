package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test
    public void turnOnTest(){
        Bike ygong = new Bike();
        ygong.setOn(true);
        assertEquals(true, ygong.isOn);
    }


    @Test
    public void turnOffTest(){
        Bike ygong = new Bike();
        ygong.setOn(true);
        ygong.setOn(false);
        assertEquals(false, ygong.isOn);
    }

   @Test
   public void accelerationOn(){
        Bike ygong = new Bike();
        ygong.setOn(true);
        ygong.setAcceleration(true);
        assertEquals(true, ygong.acceleration);
   }

   @Test
    public void gearOneAccelerationTest(){
        Bike ygong = new Bike();
        ygong.setOn(true);
        ygong.setAcceleration(true);
        int result = ygong.gear(15);
        assertEquals(16, result);
   }

    @Test
    public void gearTwoAccelerationTest(){
        Bike ygong = new Bike();
        ygong.setOn(true);
        ygong.setAcceleration(true);
        int result = ygong.gear(24);
        assertEquals(26, result);
    }

    @Test
    public void gearThreeAccelerationTest(){
        Bike ygong = new Bike();
        ygong.setOn(true);
        ygong.setAcceleration(true);
        int result = ygong.gear(35);
        assertEquals(38, result);
    }

    @Test
    public void gearFourAccelerationTest(){
        Bike ygong = new Bike();
        ygong.setOn(true);
        ygong.setAcceleration(true);
        int result = ygong.gear(44);
        assertEquals(48, result);
    }

    @Test
    public void deccelerationOn(){
        Bike ygong = new Bike();
        ygong.setOn(true);
        ygong.setDecceleration(true);
        assertEquals(true, ygong.decceleration);
    }

    @Test
    public void gearOneDecelerationTest(){
        Bike ygong = new Bike();
        ygong.setOn(true);
        ygong.setDecceleration(true);
        int result = ygong.gearD(15);
        assertEquals(14, result);
    }

    @Test
    public void gearTwoDecelerationTest(){
        Bike ygong = new Bike();
        ygong.setOn(true);
        ygong.setDecceleration(true);
        int result = ygong.gearD(24);
        assertEquals(22, result);
    }

    @Test
    public void gearThreeDecelerationTest(){
        Bike ygong = new Bike();
        ygong.setOn(true);
        ygong.setDecceleration(true);
        int result = ygong.gearD(35);
        assertEquals(32, result);
    }

    @Test
    public void gearFourDecelerationTest(){
        Bike ygong = new Bike();
        ygong.setOn(true);
        ygong.setDecceleration(true);
        int result = ygong.gearD(44);
        assertEquals(40, result);
    }

}
