package com.example.demo;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long id;
   /* private LocalDate date;*/
    private LocalDateTime dateTime;
    private String name;
    private int age;
    private String projectrole;
    public Team(){
       /* date= DateFormat(LocalDate.now());*/
        dateTime= LocalDateTime.now();
    }
    public String getName() {
        return name;
    }
    public String getProjectrole() {
        return projectrole;
    }
    public void setProjectrole(String projectrole) {
        this.projectrole = projectrole;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
  /*  public LocalDate getDate() {
        return date;
    }*/
/*
    public void setDate() {
        LocalDate date= LocalDate.now();
        this.date = date;
    }*/
    public LocalDateTime getDateTime() {
        return dateTime;
    }
/*
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }*/
}
