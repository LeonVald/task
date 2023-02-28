package ru.taskproject.springhibernate.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="groupa")
public class Group {
    @OneToMany(mappedBy="owner")
    private List<Faculty> faculty;
    @Id
    @Column(name="id_groups")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_gen_group")
    @SequenceGenerator(name="seq_gen_group",sequenceName = "group_id_seq",allocationSize = 1)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @Column(name="name")
    private String group;

    public Group(){}

    public Group(long id, String group){
        this.id = id;
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
