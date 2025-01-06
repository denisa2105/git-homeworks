package itschool.exercises;

public class Course {

    private String name;
    private int creditPoints;
    private int theYearOfStudy;
    private int duration;
    private boolean isActive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(int creditPoints) {
        if (creditPoints > 0) {
            this.creditPoints = creditPoints;
        }
    }

    public int getTheYearOfStudy() {
        return theYearOfStudy;
    }

    public void setTheYearOfStudy(int theYearOfStudy) {
        if (theYearOfStudy >= 1) {
            this.theYearOfStudy = theYearOfStudy;
        }
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration > 0) {
            this.duration = duration;
        }
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Course() {
    }

    public Course(String name, boolean isActive, int creditPoints, int theYearOfStudy, int duration) {
        this.name = name;
        this.isActive = isActive;
        this.creditPoints = creditPoints;
        this.theYearOfStudy = theYearOfStudy;
        this.duration = duration;
    }

    public Course(String name) {
        this.name = name;
    }

//    private Course() {
//
//    }
}
