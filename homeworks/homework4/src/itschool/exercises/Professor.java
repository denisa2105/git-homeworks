package itschool.exercises;

public class Professor {

    private String firstName;
    private String lastName;
    private int theYearOfTeaching;
    private String theSubjectIsTeaches;
    private boolean isACourseHolder;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isACourseHolder() {
        return isACourseHolder;
    }

    public void setACourseHolder(boolean ACourseHolder) {
        isACourseHolder = ACourseHolder;
    }

    public String getTheSubjectIsTeaches() {
        return theSubjectIsTeaches;
    }

    public void setTheSubjectIsTeaches(String theSubjectIsTeaches) {
        this.theSubjectIsTeaches = theSubjectIsTeaches;
    }

    public int getTheYearOfTeaching() {
        return theYearOfTeaching;
    }

    public void setTheYearOfTeaching(int theYearOfTeaching) {
        if (theYearOfTeaching >= 1) {
            this.theYearOfTeaching = theYearOfTeaching;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Professor() {
    }

    public Professor(String firstName, String lastName, int theYearOfTeaching, String theSubjectIsTeaches, boolean isACourseHolder) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.theYearOfTeaching = theYearOfTeaching;
        this.theSubjectIsTeaches = theSubjectIsTeaches;
        this.isACourseHolder = isACourseHolder;
    }

    public Professor(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

//    private Professor() {
//
//    }


}
