package com.example.productmanagement.entity;
import javax.persistence.*;
import java.util.Set;


@Entity
@SuppressWarnings("unused")
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public String getName() {
        return name;
    }
    public Role(String roleName) {
        this.name = roleName;
    }

}
