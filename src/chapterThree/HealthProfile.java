package chapterThree;

import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String gender, int monthOfBirth, int dayOfBirth, int yearOfBirth, double height, double weight) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
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


    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }


    public void setDateOfBirth(int monthOfBirth, int dayOfBirth, int yearOfBirth) {

        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public int getDateOfBirth() {
        return this.monthOfBirth/this.dayOfBirth/this.yearOfBirth;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


    public static int getAge(){
        LocalDate curDate = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1993, 8, 14);
        Period time = Period.between(dateOfBirth, curDate);
        int age = time. getYears();
        return age;
    }

    public int maxHeartRate(){
        return 220 - getAge();
    }

    public void targetHeartRate(){
        System.out.println("Target Heart Rate is " + maxHeartRate() * 0.5 + " to " + maxHeartRate() * 0.85);
    }

   public void bmi(){
       double bmi = weight / (height * height);
       if(bmi < 18.5){
           System.out.println("Underweight");
       } else if (bmi >= 18.5 && bmi <= 24.9) {
           System.out.println("Healthy Weight");
       }else if(bmi >= 25 && bmi <= 29.9){
           System.out.println("Overweight");
       }else {
           System.out.print("Obesity");
       }
   }

}
