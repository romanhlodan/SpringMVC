package ua.com.owu.entity;


import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@ToString
@Data

public class Client {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idClient;
        private String FirstName;
        private String LastName;
        private String Education;
        private String Passport;
        private String City;
        private int Age;

}
