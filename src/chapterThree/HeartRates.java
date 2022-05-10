package chapterThree;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;

    public HeartRates(String firstNumber, String lastNumber, int yearOfBirth, int monthOfBirth, int dayOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
    }

    public HeartRates() {

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


    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }


    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }


    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }


}
