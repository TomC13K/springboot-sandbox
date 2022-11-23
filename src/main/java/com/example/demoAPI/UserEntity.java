package com.example.demoAPI;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedDate;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@Getter
@Setter
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