package com.project.employee.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

@Entity// Indicates that this class is a JPA entity.
@Data// From Lombok, automatically generates getters, setters, toString(), equals(), and hashCode() methods.
@JsonInclude(NON_DEFAULT)// Properties that are null are not included in the JSON response
@Table(name = "contacts")
public class Contact {
    @Id
    @UuidGenerator// Generates a UUID for the primary key.
    @Column(name = "id", unique = true, updatable = false)// specifies the details of a colummn
    private String id;
    private String name;
    private String email;
    private String title;
    private String adress;
    private String status;
    private String photoUrl;
}
