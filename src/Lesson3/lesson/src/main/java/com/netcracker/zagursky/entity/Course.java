package com.netcracker.zagursky.entity;


import java.util.Objects;

public class Course {
    private int id;
    private String name;
    private String trenerName;
    private String trenerLastName;
    private int hour;

    public Course() {
    }

    public Course(int id, String name, String trenerName, String trenerLastName, int hour) {
        this.id = id;
        this.name = name;
        this.trenerName = trenerName;
        this.trenerLastName = trenerLastName;
        this.hour = hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return id == course.id &&
                hour == course.hour &&
                Objects.equals(name, course.name) &&
                Objects.equals(trenerName, course.trenerName) &&
                Objects.equals(trenerLastName, course.trenerLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, trenerName, trenerLastName, hour);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrenerName() {
        return trenerName;
    }

    public void setTrenerName(String trenerName) {
        this.trenerName = trenerName;
    }

    public String getTrenerLastName() {
        return trenerLastName;
    }

    public void setTrenerLastName(String trenerLastName) {
        this.trenerLastName = trenerLastName;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Course{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", trenerName='").append(trenerName).append('\'');
        sb.append(", trenerLastName='").append(trenerLastName).append('\'');
        sb.append(", hour=").append(hour);
        sb.append('}');
        return sb.toString();
    }
}
