package chapterThree;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int yearOfBirth;
    private String monthOfBirth;
    private int dayOfBirth;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String gender, int yearOfBirth, String monthOfBirth, int dayOfBirth, double height, double weight) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public HealthProfile() {

    }


    public int age(int years){
        int age = 0;

        return age;

    }

    public int maxHeartRate(int age){
        int maxHeartRate = 0;

        maxHeartRate = 220 - age;

        return maxHeartRate;
    }

    public double targetHeartRate(int maxHeartRate){
        double targetHeartRate = 0.0;

        if(maxHeartRate >= 0.5 && maxHeartRate <= 0.85){
            targetHeartRate = maxHeartRate;

        }

        return targetHeartRate;
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


    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }


    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }


    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
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


}
