package tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KataTest {

    @Test
    public void additionTest() {
        Kata calculator = new Kata();
        int result = calculator.add(2, 6);
        assertEquals(8, result);
        assertEquals(66, calculator.add(54, 12));
    }

    @Test
    public void subtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(4, 2);
        assertEquals(2, result);
    }

    @Test
    public void absoluteTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(2, 4);
        assertEquals(2, result);
    }

    @Test
    public void productTest(){
        Kata calculator = new Kata();
        int result = calculator.product(4, 2);
        assertEquals(8, result);
    }

    @Test
    public void quotientTest(){
        Kata calculator = new Kata();
        int result = calculator.quotient(4, 2);
        assertEquals(2, result);
    }

    @Test
    public void quotient0Test(){
        Kata calculator = new Kata();
        int result = calculator.quotient(14, 0);
        assertEquals(0, result);
    }

    @Test
    public void mysteryNumberLowTest(){
        Kata calculator = new Kata();
        String result = calculator.mysteryNumber(10);
        assertEquals("too low", result);

    }

    @Test
    public void mysteryNumberTest(){
        Kata calculator = new Kata();
        String result = calculator.mysteryNumber(40);
        assertEquals("correct", result);

    }

    @Test
    public void mysteryNumberHighTest(){
        Kata calculator = new Kata();
        String result = calculator.mysteryNumber(60);
        assertEquals("too high", result);

    }

    @Test
    public void OddNumberTest(){
        Kata calculator = new Kata();
        String result = calculator.evenOddNumber(9);
        assertEquals("It is an odd number", result);
    }

    @Test
    public void evenNumberTest(){
        Kata calculator = new Kata();
        String result = calculator.evenOddNumber(6);
        assertEquals("It is an even number", result);
    }

    @Test
    public void bitFlipper0ne(){
        Kata calculator = new Kata();
        int result = calculator.bitFlipper(1);
        assertEquals(0, result);
    }

    @Test
    public void bitFlipperZero(){
        Kata calculator = new Kata();
        int result = calculator.bitFlipper(0);
        assertEquals(1, result);
    }

   @Test
    public void iniFinTempTest(){
        Kata science = new Kata();
        double result = science.energy(55.5, 3.5, 10.5);
        assertEquals(1_625_484.0, result);
    }

   @Test
    public void firstGradeTest(){
       Kata scoreCalculator = new Kata();
       String result = scoreCalculator.grade(95);
       assertEquals("A", result);
   }

    @Test
    public void secondGradeTest(){
        Kata scoreCalculator = new Kata();
        String result = scoreCalculator.grade(89.9);
        assertEquals("B", result);
    }

    @Test
    public void thirdGradeTest(){
        Kata scoreCalculator = new Kata();
        String result = scoreCalculator.grade(79);
        assertEquals("C", result);
    }

    @Test
    public void fourthGradeTest(){
        Kata scoreCalculator = new Kata();
        String result = scoreCalculator.grade(66);
        assertEquals("D", result);
    }

    @Test
    public void fifthGradeTest(){
        Kata scoreCalculator = new Kata();
        String result = scoreCalculator.grade(29.5);
        assertEquals("F", result);
    }

    @Test
    public void passFiftyFiveTest(){
        Kata fiftyFive = new Kata();
        String result = fiftyFive.report(67);
        assertEquals("Pass", result);
    }

    @Test
    public void failFiftyFiveTest(){
        Kata fiftyFive = new Kata();
        String result = fiftyFive.report(54);
        assertEquals("Fail", result);
    }

    @Test
    public void feetIntoMetersTest(){
        Kata feetToMeters = new Kata();
        double result = feetToMeters.meters(16.5);
        assertEquals(5.0325, result);
    }

    @Test
    public void poundsIntoKgTest(){
        Kata poundsToKg = new Kata();
        double result = poundsToKg.kg(55.5);
        assertEquals(25.197, result);
    }

    @Test
    public void costOfDrivingTest(){
        Kata costOfDriving = new Kata();
        double result = costOfDriving.cost(900.5, 25.5, 3.55);
        assertEquals(125.36, result);
    }

    @Test
    public void minutesYearsTest(){
        Kata time = new Kata();
        int result = time.years(1_000_000_000);
        assertEquals(1902, result);
    }

    @Test
    public void minutesDaysTest(){
        Kata time = new Kata();
        int result = time.days(1_000_000_000);
        assertEquals(214, result);
    }

    @Test
    public void futureInvestmentValueTest(){
        Kata futureInvestment = new Kata();
        double result = futureInvestment.value(1000.56, 4.25, 1);
        assertEquals(1043.92, result);
    }

    @Test
    public void compoundValueTest(){
        Kata compound = new Kata();
        double result = compound.accountValue(100.00);
        assertEquals(608.81, result);
    }

    @Test
    public void interestTest(){
        Kata finance = new Kata();
        double result = finance.interest(1000, 3.5);
        assertEquals(2.91667, result);
    }

    @Test
    public void triangleAreaTest(){
        Kata geometry = new Kata();
        double result = geometry.area(1.5, -3.4, 4.6, 5.0, 9.5, -3.4);
        assertEquals(33.6, result);
    }

    @Test
    public void bmiTest(){
        Kata health = new Kata();
        double result = health.bmi(95.5, 50.00);
        assertEquals(26.8573, result);
    }

    @Test
    public void factorsTest(){
        int factors = Kata.noOfFactorsOf(5);
        assertEquals(2, factors);

        factors = Kata.noOfFactorsOf(10);
        assertEquals(4, factors);
    }

    @Test
    public void primeNumberTest(){
        boolean isPrime = Kata.isPrime(5);
        assertTrue(isPrime);
    }





}
