package edu.csf.oop.java.shedule.faculties;

public class Students {
    private final String middleName;
    private final int group;
    private final int course;

    public Students(String middleName, int group, int course) {
        this.group = group;
        this.middleName = middleName;
        this.course = course;
    }
}
