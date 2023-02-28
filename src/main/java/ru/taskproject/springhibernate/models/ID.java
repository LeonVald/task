package ru.taskproject.springhibernate.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "id")
public class ID {
    @ManyToMany(mappedBy = "studentList")
    private List<Student> studentList;
    @ManyToMany(mappedBy = "teacherList")
    private List<Teacher> teacherList;
    @ManyToMany(mappedBy = "facultyList")
    private List<Faculty> facultyList;
    @ManyToMany(mappedBy = "lessonList")
    private List<lessons> lessonList;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_gen_id")
    @SequenceGenerator(name="seq_gen_id",sequenceName = "id_id_seq",allocationSize = 1)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @Column(name="id_student")
    private long id_stud;
    @Column(name="id_teacher")
    private long id_teach;
    @Column(name="id_faculty")
    private long id_faculty;
    @Column(name="id_lesson")
    private long id_lesson;

    public ID(){}

    public ID(long id,long id_stud,long id_teach,long id_faculty,long id_lesson){
        this.id = id;
        this.id_stud = id_stud;
        this.id_teach = id_teach;
        this.id_faculty = id_faculty;
        this.id_lesson = id_lesson;
    }

    public long getId_stud() {
        return id_stud;
    }

    public void setId_stud(long id_stud) {
        this.id_stud = id_stud;
    }

    public long getId_teach() {
        return id_teach;
    }

    public void setId_teach(long id_teach) {
        this.id_teach = id_teach;
    }

    public long getId_faculty() {
        return id_faculty;
    }

    public void setId_faculty(long id_faculty) {
        this.id_faculty = id_faculty;
    }

    public long getId_lesson() {
        return id_lesson;
    }

    public void setId_lesson(long id_lesson) {
        this.id_lesson = id_lesson;
    }
}
