package ru.taskproject.springhibernate.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "lessons")
public class lessons {

    @ManyToMany
    @JoinTable(
            name = "id",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_les")
    )
    private List<lessons> lessonsList;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_gen_les")
    @SequenceGenerator(name="seq_gen_les",sequenceName = "les_id_seq",allocationSize = 1)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @Column(name="name")
    private String name;

    public lessons(){}
    public lessons(long id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}