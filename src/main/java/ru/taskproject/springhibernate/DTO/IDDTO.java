package ru.taskproject.springhibernate.DTO;

public class IDDTO {
    private long ID;
    private long Student;
    private long Teacher;
    private long Lesson;
    private long Faculty;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getStudent() {
        return Student;
    }

    public void setStudent(long student) {
        Student = student;
    }

    public long getTeacher() {
        return Teacher;
    }

    public void setTeacher(long teacher) {
        Teacher = teacher;
    }

    public long getLesson() {
        return Lesson;
    }

    public void setLesson(long lesson) {
        Lesson = lesson;
    }

    public long getFaculty() {
        return Faculty;
    }

    public void setFaculty(long faculty) {
        Faculty = faculty;
    }
}
