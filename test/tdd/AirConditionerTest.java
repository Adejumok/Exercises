package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test
    public void checkIfAcIsOnTest(){
        AirCon sony = new AirCon();
        sony.setOn(true);
        assertEquals(true, sony.isOn());

    }

    @Test
    public void checkIfAcIsOffTest(){
        AirCon lg = new AirCon();
        lg.setOn(false);
        assertEquals(false, lg.isOn());
    }

    @Test
    public void increaseTemperatureTest(){
        AirCon thermocool = new AirCon();
        thermocool.setOn(true);
        thermocool.increaseTemperature(true);
        assertEquals(true, thermocool.getTemperature());
    }

    @Test
    public void decreaseTemperatureTest(){
        AirCon thermostat = new AirCon();
        thermostat.setOn(true);
        thermostat.decreaseTemperature(true);
        assertEquals(true, thermostat.getTemperature());
    }

    @Test
    public void increaseTemperatureBeyond30Test(){
        AirCon thermostat = new AirCon();
        thermostat.setOn(true);
        thermostat.increaseTemperatureBeyond30(35);
        assertEquals(false, thermostat.getTemperature());
    }

    @Test
    public void decreaseTemperatureBelow16Test(){
        AirCon lg = new AirCon();
        lg.setOn(true);
        lg.decreaseTemperatureBelow16(12);
        assertEquals(false, lg.getTemperature());
    }

}
