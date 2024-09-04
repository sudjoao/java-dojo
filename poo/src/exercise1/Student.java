package exercise1;

import java.util.List;

public class Student {
    private final List<Grade> gradeList;
    private final String name;

    public Student(List<Grade> gradeList, String name) {
        this.gradeList = gradeList;
        this.name = name;
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - " + gradeList;
    }
}
