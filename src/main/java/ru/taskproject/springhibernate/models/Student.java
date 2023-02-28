package ru.taskproject.springhibernate.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Students")
public class Student {

    @ManyToMany
    @JoinTable(
            name = "id",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_stud")
    )
    private List<Student> studentList;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_gen_stud")
    @SequenceGenerator(name="seq_gen_stud",sequenceName = "stud_id_seq",allocationSize = 1)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @Column(name = "fio_student")
    private String name;
    @Column(name = "ticket")
    private int ticket;
    @Column(name = "groupa")
    private int group;
    @Column(name = "faculty")
    private String faculty;

    public Student() {}
    public Student(long id, String name, int ticket, int group, String faculty){
        this.id = id;
        this.name = name;
        this.ticket = ticket;
        this.group = group;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
