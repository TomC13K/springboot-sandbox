package com.example.demoAPI;

import org.springframework.data.annotation.LastModifiedDate;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class UserEntity {

    public UserEntity() {}
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer userID;

    public String name;

    public String surname;

    public Integer age;

    public Integer age2;

    @Column(nullable = true)         // should be FALSE but for testing leave > true
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer id) {
        this.userID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge2() {
        return age2;
    }

    public void setAge2(Integer age) {
        this.age2 = age;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("user ID : ").append(userID);
        sb.append(" ,name : ").append(name);
        sb.append(" ,surname : ").append(surname);
        sb.append(" ,age : ").append(age);
        sb.append(" ,age2 : ").append(age2);
        sb.append(" ,updatedAt : ").append(updatedAt);

        return sb.toString();
    }

}