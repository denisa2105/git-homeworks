package itschool.exercises;

public class Student {

    private String firstName;
    private String lastName;
    private int yearOfStudy;
    private String speciality;
    private boolean isIntegralist;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        if (yearOfStudy >= 1) {
            this.yearOfStudy = yearOfStudy;
        }
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public boolean isIntegralist() {
        return isIntegralist;
    }

    public void setIntegralist(boolean integralist) {
        isIntegralist = integralist;
    }

    public Student() {
    }

    public Student(String firstName, String lastName, int yearOfStudy, String speciality, boolean isIntegralist) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfStudy = yearOfStudy;
        this.speciality = speciality;
        this.isIntegralist = isIntegralist;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    private Student() {
//
//    }

}
