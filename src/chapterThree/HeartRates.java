package chapterThree;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;

    public HeartRates(String firstName, String lastName, int monthOfBirth, int dayOfBirth, int yearOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setDateOfBirth(int monthOfBirth, int dayOfBirth, int yearOfBirth) {

        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public int getDateOfBirth() {
        return this.monthOfBirth/this.dayOfBirth/this.yearOfBirth;
    }

    public int getAge(){
        LocalDate presentTime = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1985, 9, 12);
        Period moment = Period.between(birthDate, presentTime);
        int age = moment.getYears();
        return age;
    }

    public double maxHeartRate(){
        return 220 - getAge();
    }

    public void targetHeartRate(){
        System.out.println("Target Heart Rate Range is " + maxHeartRate() * 0.5 + " to " + maxHeartRate() * 0.85);
    }

}
