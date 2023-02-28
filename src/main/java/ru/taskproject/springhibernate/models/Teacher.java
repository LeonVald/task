package ru.taskproject.springhibernate.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Teachers")
public class Teacher {

    @ManyToMany
    @JoinTable(
            name = "id",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_teach")
    )
    private List<Teacher> teacherList;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_gen_teach")
    @SequenceGenerator(name="seq_gen_teach",sequenceName = "teach_id_seq",allocationSize = 1)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @Column(name="fio_teacher")
    private String name;
    @Column(name="tnumber")
    private String number;
    @Column(name="lessons")
    private String lesson;

    public Teacher(){}

    public Teacher(long id, String name, String number, String lesson){
        this.id = id;
        this.name = name;
        this.number = number;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
