package ru.taskproject.springhibernate.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "faculty")
public class Faculty {
    @ManyToOne
    @JoinColumn(name = "id_group", referencedColumnName = "id")
    private Faculty owner;

    @ManyToMany
    @JoinTable(
            name = "id",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_fac")
    )
    private List<Faculty> facultyList;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_gen_fac")
    @SequenceGenerator(name="seq_gen_fac",sequenceName = "fac_id_seq",allocationSize = 1)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @Column(name="name")
    private String name;
    @Column(name="id_group")
    private long id_group;

    public Faculty(){}

    public Faculty(long id, String name, long id_group){
        this.id = id;
        this.name = name;
        this.id_group = id_group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId_group() {
        return id_group;
    }

    public void setId_group(long id_group) {
        this.id_group = id_group;
    }
}
